import { Component, Input, OnInit } from '@angular/core';
import { StudentService } from '../../../services/student.service';
import { Student } from '../../../models/student';
import { RouterOutlet } from '@angular/router';
import { EStudentHeaderComponent } from '../e-student-header/e-student-header.component';
import { SidenavComponent, SidenavItem } from '../../sidenav/sidenav.component';
import { AuthService } from '../../../auth/auth.service';

@Component({
  selector: 'app-student',
  standalone: true,
  imports: [RouterOutlet, EStudentHeaderComponent, SidenavComponent],
  templateUrl: './student.component.html',
  styleUrl: './student.component.css'
})
export class StudentComponent implements OnInit {
  @Input() username!: string;
  student!: Student;
  brojIndeksa: string | undefined = "";
  sidenavItems: (SidenavItem | '-')[] = [];

  constructor(private studentService: StudentService, private authService: AuthService) { }

  ngOnInit(): void {
    this.loadStudentData();
    this.setSidenavItems();
  }

  setSidenavItems() {
    this.sidenavItems = [
      {
        text: 'Obaveštenja', link: '/student/obavestenja-predmeti'
      },
      { text: 'Predmeti', link: '/student/predmeti', opis: "Trenutno pohađani predmeti" },
      { text: 'Prijava ispita', link: '/student/prijava-ispita', opis: "Moguće jedino u toku ispitnog roka" },
      '-', // separator
      { text: 'Istorija studiranja', link: '/student/istorija-studiranja' },
      { text: 'Podešavanja', link: '/student/podesavanja' },
    ];
  }

  loadStudentData() {
    if (!this.username) {
      this.username = this.authService.getUsername();
    }

    console.log("StudentComponent username: " + this.username)

    this.studentService.getByUsername(this.username).subscribe(student => {
      this.student = student;
      if (this.student && this.student.studentNaGodinama) {
        this.brojIndeksa = this.student.studentNaGodinama[0].brojIndeksa;
      }
      //postavljanje podataka u servis
      this.studentService.setStudent(this.student);
    });
  }

}
