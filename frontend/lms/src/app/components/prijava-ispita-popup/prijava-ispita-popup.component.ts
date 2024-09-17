import { Component, Input } from '@angular/core';
import { MatDialogRef } from '@angular/material/dialog';
import { IspitniRok } from '../../models/ispitni-rok';
import { IspitniRokService } from '../../services/ispitni-rok.service';
import { NgFor, NgIf } from '@angular/common';
import { Student } from '../../models/student';
import { take } from 'rxjs';
import { StudentService } from '../../services/student.service';
import { StudentNaGodini } from '../../models/student-na-godini';
import { PrijavaIspita } from '../../models/prijava-ispita';
import { PrijavaIspitaService } from '../../services/prijava-ispita.service';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatSelectModule } from '@angular/material/select';
import { MatButtonModule } from '@angular/material/button';
import { FormsModule } from '@angular/forms';
import { DataService } from '../../services/data.service';
import { Predmet } from '../../models/predmet';
import { RealizacijaPredmeta } from '../../models/realizacija-predmeta';
import { RealizacijaPredmetaService } from '../../services/realizacija-predmeta.service';

@Component({
  selector: 'app-prijava-ispita-popup',
  standalone: true,
  imports: [NgFor, NgIf, FormsModule, MatFormFieldModule,MatSelectModule,MatButtonModule],
  templateUrl: './prijava-ispita-popup.component.html',
  styleUrl: './prijava-ispita-popup.component.css'
})
export class PrijavaIspitaPopupComponent {
  @Input() student!: Student;
  ispitniRokovi : IspitniRok[] = [];
  filteredIspitniRokovi: IspitniRok[] = [];
  realizacijePredmeta? : RealizacijaPredmeta[];
  currentDate : Date = new Date();
  studentNaGodini? : StudentNaGodini;
  selectedIspitniRokId?: number;
  selectedPredmet? : Predmet;
  selectedRealizacijaPredmeta? : RealizacijaPredmeta;

  constructor(public dialogRef: MatDialogRef<PrijavaIspitaPopupComponent>,private dataService : DataService, private ispitniRokService : IspitniRokService, private studentService: StudentService, private prijavaIspitaService: PrijavaIspitaService, private realizacijaPredmetaService: RealizacijaPredmetaService) {}

  ngOnInit() {
    if (!this.student) {
      this.studentService.student$.pipe(take(1)).subscribe(student => {
        this.student = student!;
        this.studentNaGodini = this.student?.studentNaGodinama![this.student?.studentNaGodinama!.length - 1]
        console.log("StudentPredmetComponent student: " + this.student.korisnik?.koriscnikoIme)
      });
    }
    this.dialogRef.updateSize('60%', '40%');
    this.ispitniRokService.getAll().subscribe(data => {
      this.ispitniRokovi = data.map(rok => ({
        ...rok,
        krajRoka: new Date(rok.krajRoka) // Convert string to Date object
      }));
      this.filterIspitniRokovi();
      console.log(this.filteredIspitniRokovi)
      console.log(this.currentDate)
      })

    this.realizacijaPredmetaService.getAll().subscribe(data =>{
      console.log(data)
      this.realizacijePredmeta = data
  })
    this.getData();
    this.selectRealizacijaPredmeta;
  }

  selectRealizacijaPredmeta() : RealizacijaPredmeta | undefined{
    for(let r of this.realizacijePredmeta!){
      if(r.predmet?.id == this.selectedPredmet?.id){
        return this.selectedRealizacijaPredmeta = r
      }
    }
    return undefined;
  }

  getData(){
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
        console.log(this.selectedRealizacijaPredmeta?.predmet?.naziv)
        const prijavaIspita: PrijavaIspita = {
          realizacijaPredmeta: this.selectRealizacijaPredmeta(), // Adjust this as needed
          evaluacijaZnanja: undefined,   // Adjust this as needed
          ispitniRok: ispitniRok,
          studentNaGodini: this.studentNaGodini,
          vremePrijave: this.currentDate
        };
        this.prijavaIspitaService.create(prijavaIspita).subscribe(response => {
          console.log('Prijava ispita created:', response);
          this.dialogRef.close();
        });
      }
    }
  }
}
