import { AfterViewInit, Component, Input, OnInit } from '@angular/core';
import { Nastavnik } from '../../../../models/nastavnik';
import { NastavnikService } from '../../../../services/nastavnik.service';
import { take } from 'rxjs';
import { NastavnikNaRealizacijiService } from '../../../../services/nastavnik-na-realizaciji.service';
import { NastavnikNaRealizaciji } from '../../../../models/nastavnik-na-realizaciji';
import { NgFor } from '@angular/common';
import { MatTableDataSource, MatTableModule } from '@angular/material/table';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-nastavnik-predmet',
  standalone: true,
  imports: [NgFor, MatTableModule, RouterLink],
  templateUrl: './nastavnik-predmet.component.html',
  styleUrl: './nastavnik-predmet.component.css'
})
export class NastavnikPredmetComponent implements AfterViewInit, OnInit {
  @Input() nastavnik!: Nastavnik;
  predmeti!: NastavnikNaRealizaciji[];

  displayedColumns: string[] = ['predmet', 'brojCasova', 'godinaIzvodjenja', 'tipNastave', 'silabus'];
  dataSource = new MatTableDataSource<NastavnikNaRealizaciji>();

  constructor(private nastavnikService: NastavnikService, private nastavnikNaRealizacijiService: NastavnikNaRealizacijiService) { }

  ngOnInit(): void {
    if (!this.nastavnik) {
      this.nastavnikService.nastavnik$.pipe(take(1)).subscribe(nastavnik => {
        this.nastavnik = nastavnik!;
        console.log("NastavnikPredmetComponent username: " + this.nastavnik.korisnik?.koriscnikoIme)
      });
    }
    this.getRealizacije();
  }

  ngAfterViewInit(): void {
    this.initializeTable();
  }

  getRealizacije() {
    if (this.nastavnik.id) {
      this.nastavnikNaRealizacijiService.
        getAllByNastavnikId(this.nastavnik.id).subscribe(data => {
          this.predmeti = data
          this.initializeTable();
        });
    }
  }

  initializeTable() {
    this.dataSource.data = this.predmeti || [];
    // this.dataSource = new MatTableDataSource<NastavnikNaRealizaciji>(this.predmeti);
    // this.dataSource.paginator = this.paginator;
  }
}
