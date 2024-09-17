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
  totalESPB: number = 0;
  averageGrade: number = 0;

  displayedColumns: string[] = ['akronim', 'naziv', 'espb', 'konacniBodovi', 'ocena'];
  dataSource!: MatTableDataSource<PrikazIstorije>;
  @ViewChild(MatPaginator) paginator!: MatPaginator;

  constructor(private studentService: StudentService) { }

  ngOnInit(): void {
    if (!this.student) {
      this.studentService.student$.pipe(take(1)).subscribe(student => {
        this.student = student!;
        console.log("IstorijaStudiranjaComponent student: " + this.student.korisnik?.koriscnikoIme)

        if (this.student.pohadjanjaPredmeta) {
          this.prikazIstorije = [];
          let totalGrades = 0;
          let totalSubjectsWithGrade = 0;

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

              this.totalESPB += temp.espb ?? 0;
            }

            if (pohadjanje.konacnaOcena) {
              temp.ocena = pohadjanje.konacnaOcena;
              totalGrades += temp.ocena;
              totalSubjectsWithGrade++;
            }

            this.prikazIstorije.push({ ...temp });
          }

          this.averageGrade = totalSubjectsWithGrade > 0 ? parseFloat((totalGrades / totalSubjectsWithGrade).toFixed(2)) : 0;

          console.log("ovo su napravljeni istorijati")
          console.log(this.prikazIstorije);
          this.dataSource = new MatTableDataSource<PrikazIstorije>(this.prikazIstorije);
        }
      });
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
