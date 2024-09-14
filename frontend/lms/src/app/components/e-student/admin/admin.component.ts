import { Component, Input, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { SidenavComponent, SidenavItem } from '../../sidenav/sidenav.component';
import { EStudentHeaderComponent } from '../e-student-header/e-student-header.component';
import { Administrator } from '../../../models/administrator';
import { AuthService } from '../../../auth/auth.service';
import { AdministratorService } from '../../../services/administrator.service';

@Component({
  selector: 'app-admin',
  standalone: true,
  imports: [RouterOutlet, EStudentHeaderComponent, SidenavComponent],
  templateUrl: './admin.component.html',
  styleUrl: './admin.component.css'
})
export class AdminComponent implements OnInit {
  @Input() username!: string;
  admin!: Administrator;
  sidenavItems: (SidenavItem | '-')[] = [];

  constructor(private adminService: AdministratorService, private authService: AuthService) { }

  ngOnInit(): void {
    this.loadData();
    this.setSidenavItems();
  }

  setSidenavItems() {
    this.sidenavItems = [
      { text: 'Administracija šifarnika', link: '/admin/administracija-sifarnika' },
      { text: 'Administracija korisnika', link: '/admin/administracija-korisnika' },
      { text: 'Administracija studijskih programa', link: '/admin/administracija-studijskih-programa' },
      { text: 'Administracija organizacije', link: '/admin/administracija-organizacije' },
      { text: 'Dodavanje nastavnika i osoblja', link: '/admin/dodavanje-nastavnika-osoblja' },
    ]
  }

  loadData() {
    if (!this.username) {
      this.username = this.authService.getUsername();
    }

    console.log("AdminComponent username: " + this.username)

    this.adminService.getByUsername(this.username).subscribe(a => {
      this.admin = a;
      this.adminService.setAdministrator(this.admin);
    })
  }
}
