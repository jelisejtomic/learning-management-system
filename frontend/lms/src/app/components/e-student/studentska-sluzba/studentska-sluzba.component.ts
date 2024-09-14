import { Component, Input, OnInit } from '@angular/core';
import { OsobljeStudentskeSluzbe } from '../../../models/osoblje-studentske-sluzbe';
import { SidenavComponent, SidenavItem } from '../../sidenav/sidenav.component';
import { OsobljeStudentskeSluzbeService } from '../../../services/osoblje-studentske-sluzbe.service';
import { AuthService } from '../../../auth/auth.service';
import { RouterOutlet } from '@angular/router';
import { EStudentHeaderComponent } from '../e-student-header/e-student-header.component';

@Component({
  selector: 'app-studentska-sluzba',
  standalone: true,
  imports: [RouterOutlet, EStudentHeaderComponent, SidenavComponent],
  templateUrl: './studentska-sluzba.component.html',
  styleUrl: './studentska-sluzba.component.css'
})
export class StudentskaSluzbaComponent implements OnInit {
  @Input() username!: string;
  osobljeStudentskeSluzbe!: OsobljeStudentskeSluzbe;
  sidenavItems: (SidenavItem | '-')[] = [];

  constructor(private osobljeStudentskeSluzbeService: OsobljeStudentskeSluzbeService, private authService: AuthService) { }

  ngOnInit(): void {
    this.loadData();
    this.setSidenavItems();
  }

  setSidenavItems() {
    this.sidenavItems = [
      { text: 'Upis studenata', link: '/studentska-sluzba/upis-studenata' },
      { text: 'Izdavanje potvrda', link: '/studentska-sluzba/izdavanje-potvrda', opis: 'Izdavanje dokumenata o toku studiranja' },
      { text: 'Formiranje rasporeda', link: '/studentska-sluzba/formiranje-rasporeda', opis: 'Raspored nastave, ispita i drugih provera znanja' },
      { text: 'Obaveštenja', link: '/studentska-sluzba/objavljivanje-obavestenja' },
      { text: 'Izdavanje udžbenika', link: '/studentska-sluzba/izdavanje-udzbenika' },
      { text: 'Inventar', link: '/studentska-sluzba/inventar', opis: 'Trebovanje kancelarijskog inventara' },
      '-',
      { text: 'Podešavanja', link: '/studentska-sluzba/podesavanja' },
    ]
  }

  loadData() {
    if (!this.username) {
      this.username = this.authService.getUsername();
    }

    console.log("StudentskaSluzbaComponent username: " + this.username)

    this.osobljeStudentskeSluzbeService.getByUsername(this.username).subscribe(oss => {
      this.osobljeStudentskeSluzbe = oss;
      this.osobljeStudentskeSluzbeService.setOsobljeStudentskeSluzbe(this.osobljeStudentskeSluzbe);
    })
  }

}
