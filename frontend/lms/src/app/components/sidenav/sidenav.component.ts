import { Component, Input } from '@angular/core';
import { Student } from '../../models/student';
import { MatSidenavModule } from '@angular/material/sidenav';
import { RouterLink, RouterOutlet } from '@angular/router';
import { NgFor, NgIf } from '@angular/common';
import { OsobljeStudentskeSluzbe } from '../../models/osoblje-studentske-sluzbe';
import { Administrator } from '../../models/administrator';
import { Nastavnik } from '../../models/nastavnik';

@Component({
  selector: 'app-sidenav',
  standalone: true,
  imports: [NgIf, NgFor, RouterLink, RouterOutlet, MatSidenavModule],
  templateUrl: './sidenav.component.html',
  styleUrl: './sidenav.component.css'
})
export class SidenavComponent {
  @Input() user?: Student | Nastavnik | OsobljeStudentskeSluzbe | Administrator;
  @Input() id?: string;
  @Input() items: (SidenavItem | '-')[] = [];
}

export interface SidenavItem {
  text: string;
  link: string;
  opis?: string;
}