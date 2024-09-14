import { Component, Input, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { SidenavComponent, SidenavItem } from '../../sidenav/sidenav.component';
import { EStudentHeaderComponent } from '../e-student-header/e-student-header.component';
import { Nastavnik } from '../../../models/nastavnik';
import { NastavnikService } from '../../../services/nastavnik.service';
import { AuthService } from '../../../auth/auth.service';

@Component({
  selector: 'app-nastavnik',
  standalone: true,
  imports: [RouterOutlet, EStudentHeaderComponent, SidenavComponent],
  templateUrl: './nastavnik.component.html',
  styleUrl: './nastavnik.component.css'
})
export class NastavnikComponent implements OnInit {
  @Input() username!: string;
  nastavnik!: Nastavnik;
  jmbg: string | undefined = "";
  sidenavItems: (SidenavItem | '-')[] = [];

  constructor(private nastavnikService: NastavnikService, private authService: AuthService) { }

  ngOnInit(): void {
    this.loadNastavnikData();
    this.setSidenavItems();
  }

  setSidenavItems() {
    this.sidenavItems = [
      { text: 'Predmeti', link: '/nastavnik/predmeti', opis: 'Predmeti na kojima ste angažovani' },
      '-',
      { text: 'Podešavanja', link: '/nastavnik/podesavanja' },
    ]
  }

  loadNastavnikData() {
    if (!this.username) {
      this.username = this.authService.getUsername();
    }

    console.log("NastavnikComponent username: " + this.username)

    this.nastavnikService.getByUsername(this.username).subscribe(n => {
      this.nastavnik = n;
      if (this.nastavnik) {
        this.jmbg = this.nastavnik.jmbg;
      }
      this.nastavnikService.setNastavnik(this.nastavnik);
    })
  }
}
