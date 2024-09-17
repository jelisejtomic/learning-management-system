import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Predmet } from '../../models/predmet';
import { PredmetService } from '../../services/predmet.service';
import { MatTabsModule } from '@angular/material/tabs';
import { NgFor } from '@angular/common';
import { HeaderComponent } from '../header/header.component';

@Component({
  selector: 'app-predmet-detalji',
  standalone: true,
  imports: [NgFor, MatTabsModule, HeaderComponent],
  templateUrl: './predmet-detalji.component.html',
  styleUrl: './predmet-detalji.component.css'
})
export class PredmetDetaljiComponent implements OnInit {
  predmet!: Predmet;

  constructor(private route: ActivatedRoute, private predmetService: PredmetService) { }

  ngOnInit(): void {
    const predmetId = Number(this.route.snapshot.paramMap.get('id'));
    console.log('predmetId: ', predmetId)
    if (predmetId) {
      this.predmetService.getById(predmetId).subscribe(predmet => {
        this.predmet = predmet;
        console.log(this.predmet)
      });
    }
  }
}