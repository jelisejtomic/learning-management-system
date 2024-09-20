import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { MatTabsModule } from '@angular/material/tabs';
import { NgFor, NgIf } from '@angular/common';
import { PrijaveIspitaComponent } from '../e-student/nastavnik/prijave-ispita/prijave-ispita.component';
import { RealizacijaPredmetaService } from '../../services/realizacija-predmeta.service';
import { RealizacijaPredmeta } from '../../models/realizacija-predmeta';

@Component({
  selector: 'app-predmet-detalji',
  standalone: true,
  imports: [NgIf, NgFor, MatTabsModule, PrijaveIspitaComponent],
  templateUrl: './predmet-detalji.component.html',
  styleUrl: './predmet-detalji.component.css'
})
export class PredmetDetaljiComponent implements OnInit {
  realizacijaPredmeta!: RealizacijaPredmeta;

  constructor(private route: ActivatedRoute, private realizacijaPredmetaService: RealizacijaPredmetaService) { }

  ngOnInit(): void {
    const realizacijaPredmetaId = Number(this.route.snapshot.paramMap.get('id'));
    if (realizacijaPredmetaId) {
      this.realizacijaPredmetaService.getById(realizacijaPredmetaId).subscribe(realizacija => {
        this.realizacijaPredmeta = realizacija;
        console.log('PredmetDetaljiComponent realizacijaPredmeta:', this.realizacijaPredmeta)
        //FIXME: bekend vraca silabus.nastavniMaterijal umjesto silabus.nastavniMaterijali
      });
    }
  }
}