import { Component, Input } from '@angular/core';
import { MatDialogRef } from '@angular/material/dialog';
import { IspitniRok } from '../../../../../models/ispitni-rok';
import { IspitniRokService } from '../../../../../services/ispitni-rok.service';
import { NgFor, NgIf } from '@angular/common';
import { Student } from '../../../../../models/student';
import { take } from 'rxjs';
import { StudentService } from '../../../../../services/student.service';
import { StudentNaGodini } from '../../../../../models/student-na-godini';
import { PrijavaIspita } from '../../../../../models/prijava-ispita';
import { PrijavaIspitaService } from '../../../../../services/prijava-ispita.service';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatSelectModule } from '@angular/material/select';
import { MatButtonModule } from '@angular/material/button';
import { FormsModule } from '@angular/forms';
import { DataService } from '../../../../../services/data.service';
import { Predmet } from '../../../../../models/predmet';
import { RealizacijaPredmeta } from '../../../../../models/realizacija-predmeta';
import { RealizacijaPredmetaService } from '../../../../../services/realizacija-predmeta.service';
import { MatSnackBar, MatSnackBarModule } from '@angular/material/snack-bar';

@Component({
  selector: 'app-prijava-ispita-popup',
  standalone: true,
  imports: [NgFor, NgIf, FormsModule, MatFormFieldModule, MatSelectModule, MatButtonModule, MatSnackBarModule],
  templateUrl: './prijava-ispita-popup.component.html',
  styleUrl: './prijava-ispita-popup.component.css'
})
export class PrijavaIspitaPopupComponent {
  @Input() student!: Student;
  ispitniRokovi: IspitniRok[] = [];
  prijaveIspita!: PrijavaIspita[];
  filteredIspitniRokovi: IspitniRok[] = [];
  realizacijePredmeta?: RealizacijaPredmeta[];
  currentDate: Date = new Date();
  studentNaGodini?: StudentNaGodini;
  selectedIspitniRokId?: number;
  selectedPredmet?: Predmet;
  selectedRealizacijaPredmeta?: RealizacijaPredmeta;

  constructor(public dialogRef: MatDialogRef<PrijavaIspitaPopupComponent>,
    private dataService: DataService,
    private ispitniRokService: IspitniRokService,
    private studentService: StudentService,
    private prijavaIspitaService: PrijavaIspitaService,
    private realizacijaPredmetaService: RealizacijaPredmetaService,
    private snackBar: MatSnackBar
  ) { }

  ngOnInit() {
    if (!this.student) {
      this.studentService.student$.pipe(take(1)).subscribe(student => {
        this.student = student!;
        this.studentNaGodini = this.student?.studentNaGodinama![this.student?.studentNaGodinama!.length - 1]
        console.log("StudentPredmetComponent student: " + this.student.korisnik?.korisnickoIme)
      });
    }
    this.dialogRef.updateSize('65%', '40%');
    this.ispitniRokService.getAll().subscribe(data => {
      this.ispitniRokovi = data.map(rok => ({
        ...rok,
        krajRoka: new Date(rok.krajRoka)
      }));
      this.filterIspitniRokovi();
    })

    this.realizacijaPredmetaService.getAll().subscribe(data => {
      this.realizacijePredmeta = data
    })
    this.getData();
    this.izaberiRealizacijaPredmeta;
  }

  izaberiRealizacijaPredmeta(): RealizacijaPredmeta | undefined {
    for (let r of this.realizacijePredmeta!) {
      if (r.predmet?.id == this.selectedPredmet?.id) {
        return this.selectedRealizacijaPredmeta = r
      }
    }
    return undefined;
  }

  getData() {
    this.selectedPredmet = this.dataService.getData();
  }

  filterIspitniRokovi(): void {
    this.filteredIspitniRokovi = this.ispitniRokovi.filter(rok => rok.krajRoka > this.currentDate);
  }

  closeDialog(): void {
    this.dialogRef.close();
  }

  prijaviIspit(): void {
    if (this.selectedIspitniRokId && this.studentNaGodini) {
      const ispitniRok = this.ispitniRokovi.find(rok => rok.id === this.selectedIspitniRokId);

      if (ispitniRok) {
        this.prijavaIspitaService.getAll().subscribe(data => {
          this.prijaveIspita = data;

          const newPrijavaIspita: PrijavaIspita = {
            realizacijaPredmeta: this.izaberiRealizacijaPredmeta(),
            evaluacijaZnanja: undefined,
            ispitniRok: ispitniRok,
            studentNaGodini: this.studentNaGodini,
            vremePrijave: this.currentDate
          };

          console.log('New prijavaIspita:', newPrijavaIspita);

          const exists = this.prijaveIspita.some(prijava => {
            return prijava.studentNaGodini?.id === newPrijavaIspita.studentNaGodini?.id &&
              prijava.ispitniRok?.id === newPrijavaIspita.ispitniRok?.id &&
              prijava.realizacijaPredmeta?.id === newPrijavaIspita.realizacijaPredmeta?.id;
          });

          if (exists) {
            console.log('Prijava ispita already exists');
            this.snackBar.open('Ispit je vec prijavljen u ovom roku.', 'Nazad', {
              duration: 3000,
              verticalPosition: 'top',
              horizontalPosition: 'center'
            });
          } else {
            this.prijavaIspitaService.create(newPrijavaIspita).subscribe({
              next: response => {
                this.prijavaIspitaService.getAll().subscribe(updatedData => {
                  // Update the service with the new list
                  this.prijavaIspitaService.updatePrijavaIspita(updatedData);
                });
                console.log('Prijava ispita created:', response);
                this.dialogRef.close();
              },
            });
          }
        });
      }
    }
  }
}
