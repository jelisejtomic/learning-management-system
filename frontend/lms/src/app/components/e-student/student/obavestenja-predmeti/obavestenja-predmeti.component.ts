import { Component, Input, OnInit } from '@angular/core';
import { Student } from '../../../../models/student';
import { StudentService } from '../../../../services/student.service';
import { take } from 'rxjs';

@Component({
  selector: 'app-obavestenja-predmeti',
  standalone: true,
  imports: [],
  templateUrl: './obavestenja-predmeti.component.html',
  styleUrl: './obavestenja-predmeti.component.css'
})
export class ObavestenjaPredmetiComponent implements OnInit {
  @Input() student!: Student;

  constructor(private studentService: StudentService) { }

  ngOnInit(): void {
    if (!this.student) {
      this.studentService.student$.pipe(take(1)).subscribe(student => {
        this.student = student!;
        console.log("ObavestenjaPredmetiComponent student: " + this.student.korisnik?.koriscnikoIme)
      });
    }
  }
}
