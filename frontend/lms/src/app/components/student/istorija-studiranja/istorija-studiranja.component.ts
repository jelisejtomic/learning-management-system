import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator, MatPaginatorModule } from '@angular/material/paginator';
import { MatTableDataSource, MatTableModule } from '@angular/material/table';
import { RouterLink } from '@angular/router';
import { Predmet } from '../../../models/predmet';
import { Student } from '../../../models/student';
import { StudentService } from '../../../services/student.service';
import { EStudentHeaderComponent } from '../../e-student-header/e-student-header.component';

@Component({
  selector: 'app-istorija-studiranja',
  standalone: true,
  imports: [EStudentHeaderComponent, RouterLink,  MatPaginatorModule, MatTableModule],
  templateUrl: './istorija-studiranja.component.html',
  styleUrl: './istorija-studiranja.component.css'
})
export class IstorijaStudiranjaComponent implements OnInit {
  constructor(private studentService:StudentService){}
  student !: Student;
  brojIndeksa : string | undefined = "";

  prikazIstorije !: PrikazIstorije[];

  displayedColumns: string[] = ['akronim', 'naziv','espb', 'konacniBodovi', 'ocena'];

  dataSource !: MatTableDataSource<PrikazIstorije> ;
  
  @ViewChild(MatPaginator) paginator!: MatPaginator;

  //TODO dodati red sa prosecnim bodovima i ocenom
  ngOnInit(): void {
    //TODO popraviti, trenutno je zakucano
    // popraviti i kako se povlaci ime univerziteta iznad imena studenta
    this.studentService.getById(1).subscribe(x=>{
      this.student = x;
      if(this.student.studentNaGodinama){
        this.brojIndeksa = this.student.studentNaGodinama[0].brojIndeksa;
      }

      if(this.student.pohadjanjaPredmeta){
        this.prikazIstorije = [];
        for(let pohadjanje of this.student.pohadjanjaPredmeta){
          let temp : PrikazIstorije= {akronim:"", espb:0,"naziv":"",konacniBodovi:0,ocena:0};
          if(pohadjanje.bodovi){
            if(pohadjanje.bonusBodovi){
              temp.konacniBodovi = pohadjanje.bodovi+pohadjanje.bonusBodovi;
            }else{
              temp.konacniBodovi = pohadjanje.bodovi;
            }
          }
          if(pohadjanje.realizacijaPredmeta?.predmet){
            temp.naziv = pohadjanje.realizacijaPredmeta.predmet.naziv;
            temp.akronim = pohadjanje.realizacijaPredmeta.predmet.naziv;
            temp.espb = pohadjanje.realizacijaPredmeta.predmet.espb;
          }
          if(pohadjanje.konacnaOcena)
            temp.ocena = pohadjanje.konacnaOcena;
          this.prikazIstorije.push({...temp});
        }
        console.log("ovo su napravljeni istorijati")
        console.log(this.prikazIstorije);
        this.dataSource = new MatTableDataSource<PrikazIstorije>(this.prikazIstorije);
      }
      
    })
  }

}

export interface PrikazIstorije{
  naziv?:string,
  akronim?:string,
  espb?:number, 
  konacniBodovi:number,
  ocena:number
}
