import { Injectable } from '@angular/core';
import { KeycloakService } from 'keycloak-angular';
import { KeycloakProfile } from 'keycloak-js';
import { Observable, from } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  constructor(private keycloak: KeycloakService) { }

  isLoggedIn(): boolean {
    return this.keycloak.isLoggedIn();
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
    }
    return 'NO_ACCESS';
  }
}
