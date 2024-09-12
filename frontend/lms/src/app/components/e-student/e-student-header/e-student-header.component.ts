import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { AuthService } from '../../../auth/auth.service';

@Component({
  selector: 'app-e-student-header',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './e-student-header.component.html',
  styleUrl: './e-student-header.component.css'
})
export class EStudentHeaderComponent {

  constructor(private authService: AuthService) { }

  logout() {
    this.authService.logout();
  }
}
