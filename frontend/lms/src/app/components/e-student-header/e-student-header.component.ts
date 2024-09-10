import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { KeycloakService } from 'keycloak-angular';

@Component({
  selector: 'app-e-student-header',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './e-student-header.component.html',
  styleUrl: './e-student-header.component.css'
})
export class EStudentHeaderComponent {

  constructor(private keycloakService: KeycloakService) { }

  logout() {
    this.keycloakService.logout('http://localhost:80/');
  }
}
