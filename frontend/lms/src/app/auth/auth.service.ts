import { Injectable } from '@angular/core';
import { KeycloakService } from 'keycloak-angular';
import { KeycloakProfile } from 'keycloak-js';
import { Observable, from } from 'rxjs';
import { RegistrovaniKorisnikService } from '../services/registrovani-korisnik.service';
import { RegistrovaniKorisnik } from '../models/registrovani-korisnik';
import { UlogaService } from '../services/uloga.service';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  constructor(private keycloak: KeycloakService, private registrovaniKorisnikService: RegistrovaniKorisnikService, private ulogaService: UlogaService) { }

  isLoggedIn(): boolean {
    return this.keycloak.isLoggedIn();
  }

  createRegistrovaniKorisnik(profile: KeycloakProfile) {
    // Ako vec postoji u bazi ne zapisuj
    this.registrovaniKorisnikService.getByUsername(profile.username!).subscribe(user => {
      if (user) {
        return;
      }

      // Kreiranje korisnika
      let registrovaniKorisnik: RegistrovaniKorisnik = {
        korisnickoIme: profile.username,
        ime: profile.firstName,
        prezime: profile.lastName,
        email: profile.email,
        uloge: []
      };

      // Dodavanje uloga
      this.ulogaService.getById(1).subscribe(uloga => {
        registrovaniKorisnik.uloge?.push(uloga);

        // Zapisivanje u bazu
        this.registrovaniKorisnikService.create(registrovaniKorisnik).subscribe(response => {
          console.log('createRegistrovaniKorisnik: ', response);
        });
      });
    });
  }

  logout() {
    this.keycloak.logout('http://localhost:80/')
  }

  getLoggedInUser(): Observable<KeycloakProfile> {
    return from(this.keycloak.loadUserProfile());
  }

  getUsername() {
    return this.keycloak.getUsername();
  }

  getUserRoles(): string[] {
    return this.keycloak.getUserRoles();
  }

  getUserRole(): string {
    if (this.keycloak.getUserRoles().includes('ROLE_ADMIN')) {
      return 'ROLE_ADMIN';
    } else if (this.keycloak.getUserRoles().includes('ROLE_STAFF')) {
      return 'ROLE_STAFF';
    } else if (this.keycloak.getUserRoles().includes('ROLE_TEACHER')) {
      return 'ROLE_TEACHER';
    } else if (this.keycloak.getUserRoles().includes('ROLE_STUDENT')) {
      return 'ROLE_STUDENT';
    } else if (this.keycloak.getUserRoles().includes('ROLE_USER')) {
      return 'ROLE_USER';
    }
    return 'NO_ACCESS';
  }
}