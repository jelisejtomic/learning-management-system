import { NgSwitch, NgIf, NgSwitchCase } from "@angular/common";
import { Component, OnInit } from "@angular/core";
import { AdminComponent } from "./admin/admin.component";
import { EStudentHeaderComponent } from "./e-student-header/e-student-header.component";
import { NastavnikComponent } from "./nastavnik/nastavnik.component";
import { StudentskaSluzbaComponent } from "./studentska-sluzba/studentska-sluzba.component";
import { StudentComponent } from "./student/student.component";
import { RouterOutlet } from "@angular/router";
import { AuthService } from "../../auth/auth.service";
import { KeycloakProfile } from "keycloak-js";

@Component({
  selector: 'app-e-student',
  standalone: true,
  imports: [NgSwitch, NgSwitchCase, NgIf, RouterOutlet, EStudentHeaderComponent, StudentComponent, NastavnikComponent, StudentskaSluzbaComponent, AdminComponent],
  templateUrl: './e-student.component.html',
  styleUrl: './e-student.component.css'
})
export class EStudentComponent implements OnInit {
  userProfile!: KeycloakProfile;
  userRole: string = '';

  constructor(private authService: AuthService) { }

  ngOnInit(): void {
    this.authService.getLoggedInUser().subscribe(profile => {
      this.userProfile = profile;
      this.userRole = this.authService.getUserRole();
    });
  }
}

