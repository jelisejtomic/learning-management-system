import { Component, Input, OnInit, ViewChild } from '@angular/core';
import { Student } from '../../../../models/student';
import { StudentService } from '../../../../services/student.service';
import { take } from 'rxjs';
import { MatPaginator, MatPaginatorModule } from '@angular/material/paginator';
import { MatTableDataSource, MatTableModule } from '@angular/material/table';
import { RouterLink } from '@angular/router';
import { Predmet } from '../../../../models/predmet';
import { MatDialogModule } from '@angular/material/dialog';
import { PopupService } from './prijava-ispita-popup/popup.service';
import { DataService } from '../../../../services/data.service';
import { PrijavaIspita } from '../../../../models/prijava-ispita';
import { PrijavaIspitaService } from '../../../../services/prijava-ispita.service';
import { NgFor, NgIf } from '@angular/common';

@Component({
  selector: 'app-prijava-ispita',
  standalone: true,
  imports: [MatPaginatorModule, MatTableModule, RouterLink, MatDialogModule, NgFor, NgIf],
  templateUrl: './prijava-ispita.component.html',
  styleUrl: './prijava-ispita.component.css'
})
export class PrijavaIspitaComponent implements OnInit {
  @Input() student!: Student;
  predmeti!: Predmet[];
  prijaveIspita: PrijavaIspita[] = [];
  currentDate: Date = new Date();
  displayedColumns: string[] = ['akronim', 'naziv', 'espb', 'obavezan', 'prijavaIspita'];
  dataSource: MatTableDataSource<Predmet> = new MatTableDataSource<Predmet>(this.predmeti);
  @ViewChild(MatPaginator) paginator!: MatPaginator;

  constructor(private studentService: StudentService, private popupService: PopupService, private dataService: DataService, private prijavaIspitaService: PrijavaIspitaService) { }

  ngOnInit(): void {
    if (!this.student) {
      this.studentService.student$.pipe(take(1)).subscribe(student => {
        this.student = student!;
        console.log("StudentPredmetComponent student: " + this.student.korisnik?.korisnickoIme)
      });
    }
    this.processStudentData();
    this.getPrijaveIspita();
    this.prijavaIspitaService.updatePrijavaIspita([]);

    this.prijavaIspitaService.prijavaIspita$.subscribe(data => {
      this.prijaveIspita = data;
    });
    console.log(this.prijaveIspita)
  }

  ngAfterViewInit(): void {
    this.initializeTable();
  }

  setData(predmet: Predmet) {
    this.dataService.setData(predmet)
  }

  processStudentData() {
    if (this.student && this.student.studentNaGodinama) {
      const poslednjaGodinaStudija = this.student.studentNaGodinama[this.student.studentNaGodinama.length - 1].godinaStudija;

      if (poslednjaGodinaStudija) {
        this.predmeti = poslednjaGodinaStudija.predmeti;
      }

      if (this.student.pohadjanjaPredmeta) {
        for (let p of this.student.pohadjanjaPredmeta) {
          for (let pr of this.predmeti) {
            if (p.realizacijaPredmeta?.predmet?.id === pr.id) {
              const index = this.predmeti.findIndex(item => item.id === pr.id);

              if (index !== -1) {
                this.predmeti.splice(index, 1);
              }
            }
          }
        }
      }
    }
  }

  getPrijaveIspita() {
    this.prijavaIspitaService.getAll().subscribe(data => {
      for (let e of data) {
        if (this.student && this.student.studentNaGodinama) {
          if (e.studentNaGodini?.id == this.student.studentNaGodinama[this.student.studentNaGodinama.length - 1].id) {
            this.prijaveIspita?.push(e)
          }
        }
      }
    })
  }

  initializeTable() {
    this.dataSource = new MatTableDataSource<Predmet>(this.predmeti);
    this.dataSource.paginator = this.paginator;
  }

  openPopup() {
    this.popupService.openPopup();
  }

  isKrajRokaValid(prijava: any): boolean {
    let tempKrajRoka = new Date(prijava.ispitniRok?.krajRoka)
    return tempKrajRoka > this.currentDate;
  }

}
