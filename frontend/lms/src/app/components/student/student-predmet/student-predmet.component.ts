import { Component, AfterViewInit, ViewChild, OnInit } from '@angular/core';
import { EStudentHeaderComponent } from '../../e-student-header/e-student-header.component';
import {MatPaginator, MatPaginatorModule} from '@angular/material/paginator';
import {MatTableDataSource, MatTableModule} from '@angular/material/table';
import { StudentService } from '../../../services/student.service';
import { Student } from '../../../models/student';
import { Predmet } from '../../../models/predmet';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-student-predmet',
  standalone: true,
  imports: [EStudentHeaderComponent, MatPaginatorModule, MatTableModule, RouterLink],
  templateUrl: './student-predmet.component.html',
  styleUrl: './student-predmet.component.css'
})
export class StudentPredmetComponent implements AfterViewInit, OnInit{
  constructor(private studentService:StudentService){}
  student !: Student;
  brojIndeksa : string | undefined = "";
  predmeti !: Predmet[];

  displayedColumns: string[] = ['akronim', 'naziv','espb', 'obavezan','semestar', 'semestarTrajanje', 'brojPredavanja', 'brojVezbi', 'stranicaPredmeta'];

  dataSource : MatTableDataSource<Predmet> = new MatTableDataSource<Predmet>(this.predmeti);
  
  @ViewChild(MatPaginator) paginator!: MatPaginator;
  

  ngOnInit(): void {
    //TODO popraviti kako se dobavlja student - uvezati keycloak, trenutno je zakucano
    // popraviti i kako se povlaci ime univerziteta iznad imena studenta
    this.studentService.getById(1).subscribe(x=>{
      this.student = x;
      if(this.student.studentNaGodinama){
        this.brojIndeksa = this.student.studentNaGodinama[0].brojIndeksa;

        this.predmeti = [];
        // for(let sng of this.student.studentNaGodinama){
          // let poslednjaGodinaStudija = this.student.studentNaGodinama[this.student.studentNaGodinama.length-1].godinaStudija;
          let poslednjaGodinaStudija = this.student.studentNaGodinama[0].godinaStudija;
          if(poslednjaGodinaStudija){
            for(let predmet of poslednjaGodinaStudija.predmeti){
              this.predmeti.push(predmet);
            }
          }
        // }
        console.log(this.predmeti);
      }
      
    })
  }
  
  ngAfterViewInit() {
    this.dataSource = new MatTableDataSource<Predmet>(this.predmeti);
    this.dataSource.paginator = this.paginator;
  }
}
