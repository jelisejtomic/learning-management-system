import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { RegistrovaniKorisnikService } from '../../../../services/registrovani-korisnik.service';
import { RegistrovaniKorisnik } from '../../../../models/registrovani-korisnik';
import { StudentService } from '../../../../services/student.service';
import { NastavnikService } from '../../../../services/nastavnik.service';
import { AdministratorService } from '../../../../services/administrator.service';
import { DatePipe, NgFor } from '@angular/common';
import { UlogaService } from '../../../../services/uloga.service';
import { Uloga } from '../../../../models/uloga';
import { GodinaStudijaService } from '../../../../services/godina-studija.service';
import { StudentNaGodiniService } from '../../../../services/student-na-godini.service';
import { GodinaStudija } from '../../../../models/godina-studija';
import { Student } from '../../../../models/student';
import { StudentNaGodini } from '../../../../models/student-na-godini';
import { OsobljeStudentskeSluzbeService } from '../../../../services/osoblje-studentske-sluzbe.service';

@Component({
  selector: 'app-upis-studenta',
  standalone: true,
  imports: [ReactiveFormsModule, NgFor, DatePipe],
  templateUrl: './upis-studenata.component.html',
  styleUrls: ['./upis-studenata.component.css'],
})
export class UpisStudenataComponent implements OnInit {
  korisnici: RegistrovaniKorisnik[] = [];
  korisniciWithoutRoles: any[] = [];
  studenti: Student[] = [];
  uloge: Uloga[] = [];
  godineStudija: GodinaStudija[] = [];
  filteredStudenti: Student[] = [];
  studentiNaGodini: StudentNaGodini[] = [];
  studentForm!: FormGroup;
  studentNaGodiniForm!: FormGroup;

  constructor(
    private fb: FormBuilder,
    private korisniciService: RegistrovaniKorisnikService,
    private studentService: StudentService,
    private nastavnikService: NastavnikService,
    private ulogaService: UlogaService,
    private godinaStudijaService: GodinaStudijaService,
    private studentNaGodiniService: StudentNaGodiniService,
    private osobljeStudentskeSluzbeService: OsobljeStudentskeSluzbeService,
    private adminService: AdministratorService
  ) { }

  ngOnInit(): void {
    this.getKorisnici();
    this.ulogaService.getAll().subscribe(data => {
      this.uloge = data;
    })
    this.godinaStudijaService.getAll().subscribe(data => {
      this.godineStudija = data;
    })
    this.studentForm = this.fb.group({
      korisnik: [null, Validators.required],
      jmbg: ['', [Validators.required, Validators.minLength(13), Validators.maxLength(13)]],
      datumRodjenja: [null, Validators.required],
      studentNaGodinama: this.fb.array([]),
      pohadjanjaPredmeta: this.fb.array([])
    });
    this.studentNaGodiniForm = this.fb.group({
      student: [null, Validators.required],
      brojIndeksa: ['', Validators.required],
      datumUpisa: [new Date().toISOString(), Validators.required],
      godinaStudija: [null, Validators.required]
    });
    this.fetchStudents();
    this.fetchStudentNaGodini();
  }

  fetchStudents(): void {
    this.studentService.getAll().subscribe(students => {
      this.studenti = students;
      this.filterStudenti(); // Filter after fetching students
    });
  }

  fetchStudentNaGodini(): void {
    this.studentNaGodiniService.getAll().subscribe(existingStudents => {
      this.studentiNaGodini = existingStudents;
      this.filterStudenti(); // Filter after fetching existing students
    });
  }

  filterStudenti(): void {
    const existingStudentIds = new Set(this.studentiNaGodini.map(existing => existing.student?.id));
    this.filteredStudenti = this.studenti.filter(student =>
      !existingStudentIds.has(student.id)
    );
  }

  getKorisnici() {
    this.korisniciService.getAll().subscribe(korisniciData => {
      this.korisnici = korisniciData;

      this.studentService.getAll().subscribe(studentiData => {
        this.adminService.getAll().subscribe(adminiData => {
          this.nastavnikService.getAll().subscribe(nastavniciData => {
            this.osobljeStudentskeSluzbeService.getAll().subscribe(studentskaSluzbaData => {
              this.filterKorisniciWithoutRoles(studentiData, adminiData, nastavniciData, studentskaSluzbaData);
            })
          });
        });
      });
    });
  }

  filterKorisniciWithoutRoles(studenti: any[], admini: any[], nastavnici: any[], studentskaSluzba: any[]) {
    this.korisniciWithoutRoles = this.korisnici.filter(korisnik => {
      const hasRole =
        studenti.some(student => student.korisnik.id === korisnik.id) ||
        admini.some(admin => admin.korisnik.id === korisnik.id) ||
        nastavnici.some(nastavnik => nastavnik.korisnik.id === korisnik.id) ||
        studentskaSluzba.some(staff => staff.korisnik.id === korisnik.id)

      return !hasRole;
    });

  }

  onSubmit(): void {
    if (this.studentForm.valid) {
      const newStudent = this.studentForm.value;
      const selectedKorisnik: RegistrovaniKorisnik = newStudent.korisnik;

      const studentRole = this.uloge.find(role => role.naziv === 'ROLE_STUDENT');

      if (studentRole) {
        if (!selectedKorisnik.uloge) {
          selectedKorisnik.uloge = [];
        }
        selectedKorisnik.uloge.push(studentRole);

      }
      if (selectedKorisnik.id) {
        this.korisniciService.update(selectedKorisnik.id, selectedKorisnik).subscribe(data => {
          console.log("updated" + data)
        })
      }
      this.studentService.create(newStudent).subscribe(data => {
        console.log("New student created")
      })

    }
  }

  dodajStudentaNaGodinu(): void {
    if (this.studentNaGodiniForm.valid) {
      const newStudentNaGodini: StudentNaGodini = this.studentNaGodiniForm.value;
      this.studentNaGodiniService.create(newStudentNaGodini).subscribe(
        response => {
          console.log('Student added to year:', response);
        },
        error => {
          console.error('Error adding student to year:', error);
        }
      );
    }
  }
}

