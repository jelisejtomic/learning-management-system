import { Component, Input, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { SidenavComponent, SidenavItem } from '../../sidenav/sidenav.component';
import { EStudentHeaderComponent } from '../e-student-header/e-student-header.component';
import { RegistrovaniKorisnik } from '../../../models/registrovani-korisnik';
import { RegistrovaniKorisnikService } from '../../../services/registrovani-korisnik.service';
import { AuthService } from '../../../auth/auth.service';

@Component({
  selector: 'app-registrovani-korisnik',
  standalone: true,
  imports: [RouterOutlet, EStudentHeaderComponent, SidenavComponent],
  templateUrl: './registrovani-korisnik.component.html',
  styleUrl: './registrovani-korisnik.component.css'
})
export class RegistrovaniKorisnikComponent implements OnInit {
  @Input() username!: string;
  registrovaniKorisnik!: RegistrovaniKorisnik;
  sidenavItems: (SidenavItem | '-')[] = [];

  constructor(private registrovaniKorisnikService: RegistrovaniKorisnikService, private authService: AuthService) { }

  ngOnInit(): void {
    this.loadUserData();
    this.setSidenavItems();
  }

  setSidenavItems() {
    this.sidenavItems = [
      {
        text: 'Podešavanja', link: '/registrovani-korisnik/podesavanja'
      }
    ]
  }

  loadUserData() {
    if (!this.username) {
      this.username = this.authService.getUsername();
    }

    console.log("RegistrovaniKorisnikComponent username: " + this.username)

    this.registrovaniKorisnikService.getByUsername(this.username).subscribe(korisnik => {
      this.registrovaniKorisnik = korisnik;

      this.registrovaniKorisnikService.setRegistrovaniKorisnik(this.registrovaniKorisnik);
    });

  }




}
