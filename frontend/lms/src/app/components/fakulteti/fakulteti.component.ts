import { Component, OnInit } from '@angular/core';
import { Fakultet } from '../../models/fakultet';
import { FakultetService } from '../../services/fakultet.service';
import { MatTreeFlatDataSource, MatTreeFlattener } from '@angular/material/tree';
import { FlatTreeControl } from '@angular/cdk/tree';
import { MatIconModule } from '@angular/material/icon';
import { MatTreeModule } from '@angular/material/tree';
import { MatButtonModule } from '@angular/material/button';
import { StudijskiProgram } from '../../models/studijski-program';
import { NgFor, NgIf } from '@angular/common';
import { StudijskiProgramService } from '../../services/studijski-program.service';
import { HeaderComponent } from '../header/header.component';
import { FooterComponent } from '../footer/footer.component';
import { UniverzitetService } from '../../services/univerzitet.service';
import { Ishod } from '../../models/ishod';
import {MatTabsModule} from '@angular/material/tabs';
import { GodinaStudija } from '../../models/godina-studija';
import { GodinaStudijaService } from '../../services/godina-studija.service';
import { Predmet } from '../../models/predmet';

@Component({
  selector: 'app-fakulteti',
  standalone: true,
  imports: [
    NgFor,
    NgIf,
    MatTreeModule,
    MatIconModule,
    MatButtonModule,
    HeaderComponent,
    FooterComponent,
    MatTabsModule,
  ],
  templateUrl: './fakulteti.component.html',
  styleUrl: './fakulteti.component.css'
})
export class FakultetiComponent implements OnInit {
  fakulteti: Fakultet[] = []; //odkomentarisati
  studijskiProgrami: StudijskiProgram[] = []; //odkomentarisati
  godineStudija: GodinaStudija[] = [];
  showDetails: boolean = false;
  selectedProgramId?: number;
  studijskiProgram?: StudijskiProgram;
  selectedSilabus: Ishod[] = [];
  selectedFakultet: any;

  predmetNaziv?: string;


  constructor(private fakultetService: FakultetService, private studijskiProgramService: StudijskiProgramService, private uniService: UniverzitetService, private godinaService: GodinaStudijaService) {}

  ngOnInit(): void {
    this.getFakulteti();
    this.getStudijskiProgrami();
    this.getGodineStudija();
  }

  getFakulteti() {
    this.uniService.getById(1).subscribe(x => {
      if (x.fakulteti) {
        this.fakulteti = x.fakulteti;
      }
    });
  }
  getGodineStudija() {
    this.godinaService.getAll().subscribe( data =>
      this.godineStudija = data)
  }

  getFilteredStudijskiProgrami() {
    if (!this.selectedFakultet) return [];
    return this.studijskiProgrami.filter(sp => sp.fakultet?.id === this.selectedFakultet.id);
  }
  
  getUniqueGodine(godine: GodinaStudija[]): GodinaStudija[] {
    const uniqueGodine = new Map<number, GodinaStudija>();
    
    godine.forEach(godina => {
      if (godina.godina) {
        uniqueGodine.set(godina.godina, godina);
      }
    });

    return Array.from(uniqueGodine.values()).sort((a, b) => {
      const godinaA = a.godina ?? Number.MAX_SAFE_INTEGER;
      const godinaB = b.godina ?? Number.MAX_SAFE_INTEGER;
      return godinaA - godinaB;
  });
  }

  getFilteredPredmeti(godina: GodinaStudija, studijskiProgram: StudijskiProgram): Predmet[] {
    if (!godina || !studijskiProgram) return [];
    
    if (!studijskiProgram.godineStudija?.some(g => g.id === godina.id)) {
      return [];
    }

    const uniquePredmeti = new Map<number, Predmet>();
    
    godina.predmeti?.forEach(predmet => {
      if (predmet.id) {
        uniquePredmeti.set(predmet.id, predmet);
      }
    });
    
    return Array.from(uniquePredmeti.values());
  }

  getStudijskiProgrami() {
    this.uniService.getById(1).subscribe(x => {
      this.studijskiProgrami = [];
      if (x.fakulteti && x.fakulteti) {
        for (let fakultet of this.fakulteti) {
          if (fakultet.studijskiProgrami) {
            for (let st of fakultet.studijskiProgrami)
              this.studijskiProgrami.push({ ...st });
          }
        }
      }
      console.log(this.studijskiProgrami)
    });
  }

  onSilabusButtonClick(predmetId: number, predmetNaziv: string) {
    this.predmetNaziv = predmetNaziv;
    const predmet = this.findSubjectById(predmetId);
    this.selectedSilabus = predmet?.silabus || [];
  }

  findSubjectById(predmetId: number) {
    if (this.studijskiProgrami?.length) {
      for (const godina of this.studijskiProgrami[0].godineStudija || []) {
        for (const predmet of godina.predmeti || []) {
          if (predmet.id === predmetId) {
            return predmet;
          }
        }
      }
    }
    return null;
  }

  hideSilabus() {
    this.selectedSilabus = [];
  }

  toggleDetails(): void {
    this.showDetails = !this.showDetails;
  }
}