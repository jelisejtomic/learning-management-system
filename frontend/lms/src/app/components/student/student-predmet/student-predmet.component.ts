import { Component, AfterViewInit, ViewChild, OnInit } from '@angular/core';
import { EStudentHeaderComponent } from '../../e-student-header/e-student-header.component';
import { MatPaginator, MatPaginatorModule } from '@angular/material/paginator';
import { MatTableDataSource, MatTableModule } from '@angular/material/table';
import { StudentService } from '../../../services/student.service';
import { Student } from '../../../models/student';
import { Predmet } from '../../../models/predmet';
import { RouterLink } from '@angular/router';
import { KeycloakService } from 'keycloak-angular';

@Component({
  selector: 'app-student-predmet',
  standalone: true,
  imports: [EStudentHeaderComponent, MatPaginatorModule, MatTableModule, RouterLink],
  templateUrl: './student-predmet.component.html',
  styleUrl: './student-predmet.component.css'
})
export class StudentPredmetComponent implements AfterViewInit, OnInit {
  constructor(private studentService: StudentService, private keycloakService: KeycloakService) { }
  userProfile: any | null = null;
  student !: Student;
  predmeti !: Predmet[];
  brojIndeksa: string | undefined = "";

  displayedColumns: string[] = ['akronim', 'naziv', 'espb', 'obavezan', 'semestar', 'semestarTrajanje', 'brojPredavanja', 'brojVezbi', 'stranicaPredmeta'];

  dataSource: MatTableDataSource<Predmet> = new MatTableDataSource<Predmet>(this.predmeti);

  @ViewChild(MatPaginator) paginator!: MatPaginator;

  ngOnInit(): void {
    this.loadStudentData();
  }

  ngAfterViewInit() {
    this.initializeTable();
  }

  loadStudentData() {
    this.getUserProfile().then(() => {
      const username = this.userProfile.username;
      this.getStudentByUsername(username);
    });
  }

  getStudentByUsername(username: string) {
    this.studentService.getByUsername(username).subscribe(student => {
      this.student = student;
      if (student) {
        console.table(this.student);
        this.processStudentData();
      } else {
        console.log("Student nije pronadjen!")
      }
    });
  }

  processStudentData(): void {
    if (this.student.studentNaGodinama) {
      this.brojIndeksa = this.student.studentNaGodinama[0].brojIndeksa;
      const poslednjaGodinaStudija = this.student.studentNaGodinama[this.student.studentNaGodinama.length - 1].godinaStudija;

      if (poslednjaGodinaStudija) {
        this.predmeti = poslednjaGodinaStudija.predmeti;
      }
    }
  }

  getUserProfile() {
    return this.keycloakService.loadUserProfile().then(data => {
      this.userProfile = data;
      console.table(this.userProfile);
    });
  }

  initializeTable() {
    this.dataSource = new MatTableDataSource<Predmet>(this.predmeti);
    this.dataSource.paginator = this.paginator;
  }
}
