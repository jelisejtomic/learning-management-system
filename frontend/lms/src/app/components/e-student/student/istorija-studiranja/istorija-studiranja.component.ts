import { Component, Input, OnInit, ViewChild } from '@angular/core';
import { MatPaginator, MatPaginatorModule } from '@angular/material/paginator';
import { MatTableDataSource, MatTableModule } from '@angular/material/table';
import { Student } from '../../../../models/student';
import { StudentService } from '../../../../services/student.service';
import { take } from 'rxjs';

@Component({
  selector: 'app-istorija-studiranja',
  standalone: true,
  imports: [MatPaginatorModule, MatTableModule],
  templateUrl: './istorija-studiranja.component.html',
  styleUrl: './istorija-studiranja.component.css'
})
export class IstorijaStudiranjaComponent implements OnInit {
  @Input() student!: Student;
  prikazIstorije!: PrikazIstorije[];

  displayedColumns: string[] = ['akronim', 'naziv', 'espb', 'konacniBodovi', 'ocena'];
  dataSource!: MatTableDataSource<PrikazIstorije>;
  @ViewChild(MatPaginator) paginator!: MatPaginator;

  constructor(private studentService: StudentService) { }

  //TODO dodati red sa prosecnim bodovima i ocenom
  ngOnInit(): void {
    if (!this.student) {
      this.studentService.student$.pipe(take(1)).subscribe(student => {
        this.student = student!;
        console.log("IstorijaStudiranjaComponent student: " + this.student.korisnik?.koriscnikoIme)
      });
    }

    if (this.student.pohadjanjaPredmeta) {
      this.prikazIstorije = [];
      for (let pohadjanje of this.student.pohadjanjaPredmeta) {
        let temp: PrikazIstorije = { akronim: "", espb: 0, "naziv": "", konacniBodovi: 0, ocena: 0 };
        if (pohadjanje.bodovi) {
          if (pohadjanje.bonusBodovi) {
            temp.konacniBodovi = pohadjanje.bodovi + pohadjanje.bonusBodovi;
          } else {
            temp.konacniBodovi = pohadjanje.bodovi;
          }
        }
        if (pohadjanje.realizacijaPredmeta?.predmet) {
          temp.naziv = pohadjanje.realizacijaPredmeta.predmet.naziv;
          temp.akronim = pohadjanje.realizacijaPredmeta.predmet.naziv;
          temp.espb = pohadjanje.realizacijaPredmeta.predmet.espb;
        }
        if (pohadjanje.konacnaOcena)
          temp.ocena = pohadjanje.konacnaOcena;
        this.prikazIstorije.push({ ...temp });
      }
      console.log("ovo su napravljeni istorijati")
      console.log(this.prikazIstorije);
      this.dataSource = new MatTableDataSource<PrikazIstorije>(this.prikazIstorije);
    }
  }

}

export interface PrikazIstorije {
  naziv?: string,
  akronim?: string,
  espb?: number,
  konacniBodovi: number,
  ocena: number
}
