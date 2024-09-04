import { Component, OnInit } from '@angular/core';
import { Nastavnik } from '../../models/nastavnik';
import { NgFor } from '@angular/common';
import { MatListModule } from '@angular/material/list';
import { UniverzitetService } from '../../services/univerzitet.service';

@Component({
  selector: 'app-zaposleni',
  standalone: true,
  imports: [NgFor, MatListModule],
  templateUrl: './zaposleni.component.html',
  styleUrl: './zaposleni.component.css'
})
export class ZaposleniComponent implements OnInit {
  zaposleni: Nastavnik[] = [];

  constructor(private univerzitetService: UniverzitetService) { }

  ngOnInit(): void {
    this.getNastavniciForUniverzitet(1);
  }

  getNastavniciForUniverzitet(id: number) {
    this.univerzitetService.getNastavniciForUniverzitet(id).subscribe(x => { this.zaposleni = x });
  }
}
