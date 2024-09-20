import { Component, OnInit } from '@angular/core';
import { EvaluacijaZnanja } from '../../../../../models/evaluacija-znanja';
import { ActivatedRoute } from '@angular/router';
import { RealizacijaPredmetaService } from '../../../../../services/realizacija-predmeta.service';
import { DatePipe, NgFor, NgIf } from '@angular/common';
import { MatTableModule } from '@angular/material/table';
import { EvaluacijaZnanjaService } from '../../../../../services/evaluacija-znanja.service';
import { forkJoin } from 'rxjs';
import { Polaganje } from '../../../../../models/polaganje';
import { PolaganjeDialogComponent } from './polaganje-dialog/polaganje-dialog.component';
import { MatDialog } from '@angular/material/dialog';
import { DodajPolaganjeDialogComponent } from './dodaj-polaganje-dialog/dodaj-polaganje-dialog.component';
import { PrijavaIspita } from '../../../../../models/prijava-ispita';
import { PrijavaIspitaService } from '../../../../../services/prijava-ispita.service';
import { UnosOceneComponent } from '../unos-ocene/unos-ocene.component';

@Component({
  selector: 'app-evaluacija-znanja',
  standalone: true,
  imports: [NgIf, NgFor, DatePipe, MatTableModule, UnosOceneComponent, DodajPolaganjeDialogComponent],
  templateUrl: './evaluacija-znanja.component.html',
  styleUrl: './evaluacija-znanja.component.css'
})
export class EvaluacijaZnanjaComponent implements OnInit {
  realizacijaPredmetaId: number = 0;
  prijavaIspita!: PrijavaIspita;
  evaluacijeZnanja: EvaluacijaZnanja[] = [];
  displayedColumns: string[] = ['datum', 'vremeOd', 'vremeDo', 'mestoOdrzavanja', 'minBodovi',
    'maxBodovi', 'tipEvaluacije', 'ishod', 'polaganja'];

  constructor(private route: ActivatedRoute, private dialog: MatDialog, private realizacijaPredmetaService: RealizacijaPredmetaService, private evaluacijaZnanjaService: EvaluacijaZnanjaService, private prijavaIspitaService: PrijavaIspitaService) { }

  ngOnInit(): void {
    this.realizacijaPredmetaId = +this.route.snapshot.paramMap.get('realizacijaPredmetaId')!;
    const prijavaIspitaId = +this.route.snapshot.paramMap.get('prijavaIspitaId')!;

    this.loadPrijavaIspita(prijavaIspitaId);
    this.loadEvaluacijeZnanja();
  }

  loadEvaluacijeZnanja() {
    this.realizacijaPredmetaService.getById(this.realizacijaPredmetaId).subscribe(data => {
      // this.evaluacijeZnanja = data.evaluacijeZnanja ?? [];
      const evaluacijaIds = (data.evaluacijeZnanja ?? []).map(evaluacija => evaluacija.id);

      if (evaluacijaIds.length > 0) {
        const requests = evaluacijaIds.map(id => this.evaluacijaZnanjaService.getById(id!));

        forkJoin(requests).subscribe(full => {
          this.evaluacijeZnanja = full;
          console.log("EvaluacijaZnanjaComponent:", this.evaluacijeZnanja);
        });
      } else {
        this.evaluacijeZnanja = [];
      }

    });
  }

  loadPrijavaIspita(prijavaIspitaId: number) {
    this.prijavaIspitaService.getById(prijavaIspitaId).subscribe(prijava => {
      this.prijavaIspita = prijava;
      console.log('test', this.prijavaIspita.studentNaGodini?.student)
    });
  }

  openPolaganjeDialog(polaganja: Polaganje[]) {
    console.log('polaganja', polaganja)
    const dialogRef = this.dialog.open(PolaganjeDialogComponent, {
      width: '600px',
      data: { polaganja }
    });

    dialogRef.afterClosed().subscribe(result => {
      // Možeš obraditi rezultat ovde, ako je potrebno
    });
  }

  openDodajPolaganjeDialog(evaluacija: EvaluacijaZnanja) {
    console.log("openDodajPolaganjeDialog evaluacija: ", evaluacija);

    const dialogRef = this.dialog.open(DodajPolaganjeDialogComponent, {
      width: '600px',
      data: { studentNaGodini: this.prijavaIspita.studentNaGodini, evaluacijaZnanja: evaluacija }
    });

    dialogRef.componentInstance.polaganjeAdded.subscribe(() => {
      this.loadEvaluacijeZnanja();
    });

    dialogRef.afterClosed().subscribe(result => {
      if (result) {
        console.log('Dialog result: ', result);
      }
    });
  }
}
