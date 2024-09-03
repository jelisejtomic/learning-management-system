import { Component, OnInit } from '@angular/core';
import { MatTabsModule } from '@angular/material/tabs';
import { Univerzitet } from '../../models/univerzitet';
import { UniverzitetService } from '../../services/univerzitet.service';
import { NgFor } from '@angular/common';


@Component({
  selector: 'app-kontakt',
  standalone: true,
  imports: [MatTabsModule, NgFor],
  templateUrl: './kontakt.component.html',
  styleUrl: './kontakt.component.css'
})
export class KontaktComponent implements OnInit {
  univerzitet?: Univerzitet;

  constructor(private service: UniverzitetService) { }

  ngOnInit(): void {
    this.getUniverzitet();
  }

  getUniverzitet() {
    this.service.getById(1).subscribe(x => { this.univerzitet = x })
  }
}
