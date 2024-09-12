import { Component, Input, OnInit } from '@angular/core';
import { Student } from '../../../../models/student';
import { StudentService } from '../../../../services/student.service';
import { take } from 'rxjs';

@Component({
  selector: 'app-prijava-ispita',
  standalone: true,
  imports: [],
  templateUrl: './prijava-ispita.component.html',
  styleUrl: './prijava-ispita.component.css'
})
export class PrijavaIspitaComponent implements OnInit {
  constructor(private studentService: StudentService) { }
  @Input() student!: Student;

  ngOnInit(): void {
    if (!this.student) {
      this.studentService.student$.pipe(take(1)).subscribe(student => {
        this.student = student!;
        console.log("PrijavaIspitaComponent student: " + this.student.korisnik?.koriscnikoIme)
      });
    }
  }

}
