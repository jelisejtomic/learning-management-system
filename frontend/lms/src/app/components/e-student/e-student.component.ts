import { Component, OnInit } from '@angular/core';
import { RegistrovaniKorisnik } from '../../models/registrovani-korisnik';
import { KeycloakService } from 'keycloak-angular';

@Component({
  selector: 'app-e-student',
  standalone: true,
  imports: [],
  templateUrl: './e-student.component.html',
  styleUrl: './e-student.component.css'
})
export class EStudentComponent implements OnInit {
  userProfile: any | null = null;

  constructor(private keycloakService: KeycloakService) { }

  ngOnInit(): void {
    this.getUserProfile();
  }

  logout() {
    this.keycloakService.logout();
  }

  getUserProfile() {
    return this.keycloakService.loadUserProfile().then(data => {
      this.userProfile = data;
      console.table(this.userProfile);
    });
  }

}
