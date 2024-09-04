import { Component, OnInit } from '@angular/core';
import { RouterLink } from '@angular/router';
import { Student } from '../../../models/student';
import { StudentService } from '../../../services/student.service';
import { EStudentHeaderComponent } from '../../e-student-header/e-student-header.component';

@Component({
  selector: 'app-obavestenja-predmeti',
  standalone: true,
  imports: [EStudentHeaderComponent, RouterLink],
  templateUrl: './obavestenja-predmeti.component.html',
  styleUrl: './obavestenja-predmeti.component.css'
})
export class ObavestenjaPredmetiComponent implements OnInit {
  constructor(private studentService:StudentService){}
  student !: Student;
  brojIndeksa : string | undefined = "";

  ngOnInit(): void {
    //TODO popraviti, trenutno je zakucano
    // popraviti i kako se povlaci ime univerziteta iznad imena studenta
    this.studentService.getById(1).subscribe(x=>{
      this.student = x;
      if(this.student.studentNaGodinama){
        this.brojIndeksa = this.student.studentNaGodinama[0].brojIndeksa;
      }
      
    })
  }

}
