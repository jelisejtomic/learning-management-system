import { Component, AfterViewInit, ViewChild, OnInit, Input } from '@angular/core';
import { MatPaginator, MatPaginatorModule } from '@angular/material/paginator';
import { MatTableDataSource, MatTableModule } from '@angular/material/table';
import { StudentService } from '../../../../services/student.service';
import { Student } from '../../../../models/student';
import { Predmet } from '../../../../models/predmet';
import { take } from 'rxjs';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-student-predmet',
  standalone: true,
  imports: [MatPaginatorModule, MatTableModule, RouterLink],
  templateUrl: './student-predmet.component.html',
  styleUrl: './student-predmet.component.css'
})
export class StudentPredmetComponent implements AfterViewInit, OnInit {
  @Input() student!: Student;
  predmeti!: Predmet[];

  displayedColumns: string[] = ['akronim', 'naziv', 'espb', 'obavezan', 'semestar', 'semestarTrajanje', 'brojPredavanja', 'brojVezbi', 'stranicaPredmeta'];
  dataSource: MatTableDataSource<Predmet> = new MatTableDataSource<Predmet>(this.predmeti);
  @ViewChild(MatPaginator) paginator!: MatPaginator;

  constructor(private studentService: StudentService) { }

  ngOnInit(): void {
    if (!this.student) {
      this.studentService.student$.pipe(take(1)).subscribe(student => {
        this.student = student!;
        console.log("StudentPredmetComponent student: " + this.student.korisnik?.koriscnikoIme)
      });
    }
    this.processStudentData();
  }

  ngAfterViewInit(): void {
    this.initializeTable();
  }

  processStudentData() {
    if (this.student && this.student.studentNaGodinama) {
      const poslednjaGodinaStudija = this.student.studentNaGodinama[this.student.studentNaGodinama.length - 1].godinaStudija;

      if (poslednjaGodinaStudija) {
        this.predmeti = poslednjaGodinaStudija.predmeti;
      }
    }
  }

  initializeTable() {
    this.dataSource = new MatTableDataSource<Predmet>(this.predmeti);
    this.dataSource.paginator = this.paginator;
  }
}
