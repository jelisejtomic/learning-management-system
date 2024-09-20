import { Component, Input, OnInit } from '@angular/core';
import { PrijavaIspita } from '../../../../models/prijava-ispita';
import { DatePipe, NgFor, NgIf } from '@angular/common';
import { RealizacijaPredmeta } from '../../../../models/realizacija-predmeta';
import { RouterLink } from '@angular/router';
import { StudentService } from '../../../../services/student.service';

@Component({
  selector: 'app-prijave-ispita',
  standalone: true,
  imports: [RouterLink, NgIf, NgFor, DatePipe],
  templateUrl: './prijave-ispita.component.html',
  styleUrl: './prijave-ispita.component.css'
})
export class PrijaveIspitaComponent implements OnInit {
  @Input() realizacijaPredmeta!: RealizacijaPredmeta;
  prijaveIspita: PrijavaIspita[] = [];
  filteredPrijave: PrijavaIspita[] = [];

  constructor(private studentService: StudentService) { }

  ngOnInit(): void {
    this.prijaveIspita = this.realizacijaPredmeta.prijaveIspita ?? [];

    this.prijaveIspita.forEach(prijava => {
      const studentId = prijava.studentNaGodini?.student?.id;

      if (studentId) {
        this.studentService.getById(studentId).subscribe(student => {
          const pohadjanjaPredmeta = student.pohadjanjaPredmeta ?? [];
          const pohadjanje = pohadjanjaPredmeta.find(p => p.realizacijaPredmeta?.id === this.realizacijaPredmeta.id);

          if (!pohadjanje?.konacnaOcena) {
            this.filteredPrijave.push(prijava);
          }
        });
      }
    });
  }
}
