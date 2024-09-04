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

interface TreeNode {
  name: string;
  id? : number;
  children?: TreeNode[];
}

interface FlatNode {
  name: string;
  id? : number;
  level: number;
  expandable: boolean;
}



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
    FooterComponent
  ],
  templateUrl: './fakulteti.component.html',
  styleUrl: './fakulteti.component.css'
})
export class FakultetiComponent implements OnInit {
  fakulteti: Fakultet[] = []; //odkomentarisati
  showDetails: boolean = false;
  selectedProgramId?: number;
  studijskiProgrami: StudijskiProgram[] = []; //odkomentarisati
  studijskiProgram?: StudijskiProgram;
//   studijskiProgramData : StudijskiProgram[] = [{ //zakomentarisati
//     "id": 5,
//     "deleted": false,
//     "akronim": "SII",
//     "naziv": "Softversko inženjerstvo i informacione tehnologije",
//     "opis": "Ovaj studijski program obezbeđuje najšira znanja iz oblasti softverskog i informacionog inženjerstva. Na studijama se izučavaju metodološki aspekti razvoja složenih softverskih i informacionih sistema i najsavremenije prateće, posebno softverske tehnologije za primenu softverskog i informacionog inženjerstva u različitim domenskim oblastima.",
//     "fakultet": {
//       "id": 3
//     },
//     "godineStudija": [
//       {
//         "id": 75,
//         "deleted": false,
//         "godina": 3,
//         "predmeti": [
//           {
//             "id": 38,
//             "deleted": false,
//             "akronim": "LMS3LPRS",
//             "naziv": "Osnovi računarske tehnike - LPRS",
//             "espb": 5,
//             "obavezan": true,
//             "semestar": 5,
//             "semestarTrajanje": 1,
//             "brojPredavanja": 3,
//             "brojVezbi": 0,
//             "drugiObliciNastave": 2,
//             "istrazivackiRad": 0,
//             "ostaliCasovi": 1,
//             "silabus": []
//           },
//           {
//             "id": 37,
//             "deleted": false,
//             "akronim": "LMS3SNUS1",
//             "naziv": "Softver nadzorno-upravljačkih sistema",
//             "espb": 5,
//             "obavezan": true,
//             "semestar": 5,
//             "semestarTrajanje": 1,
//             "brojPredavanja": 3,
//             "brojVezbi": 0,
//             "drugiObliciNastave": 2,
//             "istrazivackiRad": 0,
//             "ostaliCasovi": 1,
//             "silabus": []
//           },
//           {
//             "id": 35,
//             "deleted": false,
//             "akronim": "LMS3VP",
//             "naziv": "Veb programiranje",
//             "espb": 7,
//             "obavezan": true,
//             "semestar": 5,
//             "semestarTrajanje": 1,
//             "brojPredavanja": 3,
//             "brojVezbi": 0,
//             "drugiObliciNastave": 2,
//             "istrazivackiRad": 0,
//             "ostaliCasovi": 1,
//             "silabus": []
//           },
//           {
//             "id": 36,
//             "deleted": false,
//             "akronim": "LMS3ST",
//             "naziv": "Statistika",
//             "espb": 6,
//             "obavezan": true,
//             "semestar": 5,
//             "semestarTrajanje": 1,
//             "brojPredavanja": 3,
//             "brojVezbi": 1,
//             "drugiObliciNastave": 2,
//             "istrazivackiRad": 0,
//             "ostaliCasovi": 0,
//             "silabus": []
//           },
//           {
//             "id": 44,
//             "deleted": false,
//             "akronim": "LMS3DS",
//             "naziv": "Distribuirani sistemi u geomatici",
//             "espb": 8,
//             "obavezan": false,
//             "semestar": 6,
//             "semestarTrajanje": 1,
//             "brojPredavanja": 4,
//             "brojVezbi": 0,
//             "drugiObliciNastave": 3,
//             "istrazivackiRad": 0,
//             "ostaliCasovi": 1,
//             "silabus": []
//           },
//           {
//             "id": 39,
//             "deleted": false,
//             "akronim": "LMS3PGK",
//             "naziv": "Pisana i govorna komunikacija u tehnici",
//             "espb": 4,
//             "obavezan": true,
//             "semestar": 6,
//             "semestarTrajanje": 1,
//             "brojPredavanja": 0,
//             "brojVezbi": 0,
//             "drugiObliciNastave": 0,
//             "istrazivackiRad": 0,
//             "ostaliCasovi": 0,
//             "silabus": []
//           },
//           {
//             "id": 45,
//             "deleted": false,
//             "akronim": "LMS3SNUS2",
//             "naziv": "Softver nadzorno-upravljačkih sistema",
//             "espb": 8,
//             "obavezan": false,
//             "semestar": 6,
//             "semestarTrajanje": 1,
//             "brojPredavanja": 4,
//             "brojVezbi": 0,
//             "drugiObliciNastave": 3,
//             "istrazivackiRad": 0,
//             "ostaliCasovi": 0,
//             "silabus": []
//           },
//           {
//             "id": 34,
//             "deleted": false,
//             "akronim": "LMS3SO",
//             "naziv": "Softverski obrasci i komponente",
//             "espb": 7,
//             "obavezan": true,
//             "semestar": 5,
//             "semestarTrajanje": 1,
//             "brojPredavanja": 3,
//             "brojVezbi": 0,
//             "drugiObliciNastave": 2,
//             "istrazivackiRad": 0,
//             "ostaliCasovi": 1,
//             "silabus": []
//           },
//           {
//             "id": 42,
//             "deleted": false,
//             "akronim": "LMS3PP",
//             "naziv": "Programski prevodioci",
//             "espb": 4,
//             "obavezan": true,
//             "semestar": 6,
//             "semestarTrajanje": 1,
//             "brojPredavanja": 2,
//             "brojVezbi": 0,
//             "drugiObliciNastave": 2,
//             "istrazivackiRad": 0,
//             "ostaliCasovi": 0,
//             "silabus": []
//           },
//           {
//             "id": 43,
//             "deleted": false,
//             "akronim": "LMS3MRS",
//             "naziv": "Metodologije razvoja softvera",
//             "espb": 5,
//             "obavezan": true,
//             "semestar": 6,
//             "semestarTrajanje": 1,
//             "brojPredavanja": 2,
//             "brojVezbi": 0,
//             "drugiObliciNastave": 2,
//             "istrazivackiRad": 0,
//             "ostaliCasovi": 1,
//             "silabus": []
//           },
//           {
//             "id": 41,
//             "deleted": false,
//             "akronim": "LMS3IČR",
//             "naziv": "Interakcija čovek računar",
//             "espb": 4,
//             "obavezan": true,
//             "semestar": 6,
//             "semestarTrajanje": 1,
//             "brojPredavanja": 2,
//             "brojVezbi": 0,
//             "drugiObliciNastave": 1,
//             "istrazivackiRad": 0,
//             "ostaliCasovi": 1,
//             "silabus": []
//           }
//         ]
//       },
//       {
//         "id": 80,
//         "deleted": false,
//         "godina": 4,
//         "predmeti": [
//           {
//             "id": 46,
//             "deleted": false,
//             "akronim": "LMS4SP",
//             "naziv": "Stručna praksa - projekat",
//             "espb": 6,
//             "obavezan": true,
//             "semestar": 7,
//             "semestarTrajanje": 2,
//             "brojPredavanja": 0,
//             "brojVezbi": 0,
//             "drugiObliciNastave": 0,
//             "istrazivackiRad": 0,
//             "ostaliCasovi": 6,
//             "silabus": []
//           },
//           {
//             "id": 47,
//             "deleted": false,
//             "akronim": "LMS4PGK",
//             "naziv": "Pisana i govorna komunikacija u tehnici",
//             "espb": 4,
//             "obavezan": true,
//             "semestar": 8,
//             "semestarTrajanje": 1,
//             "brojPredavanja": 2,
//             "brojVezbi": 0,
//             "drugiObliciNastave": 1,
//             "istrazivackiRad": 0,
//             "ostaliCasovi": 0,
//             "silabus": []
//           }
//         ]
//       }
//     ]
// }];
// hardcodedFakulteti : Fakultet[] = [ //zakomentarisati
//     {
//       "id": 1,
//       "deleted": false,
//       "naziv": "Poslovni fakultet",
//       "studijskiProgrami": [],
//       "univerzitet": {
//         "id": 1,
//         "deleted": false,
//         "naziv": "Univerzitet u Beogradu",
//         "opis": "Jedan od vodećih univerziteta u regionu. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam nibh massa, tincidunt porta tristique eu, fringilla non ante. Sed posuere purus enim, in efficitur metus."
//       }
//     },
//     {
//       "id": 2,
//       "deleted": false,
//       "naziv": "Fakultet za informatiku i računarstvo",
//       "studijskiProgrami": [
//         {
//           "id": 2,
//           "deleted": false,
//           "akronim": "IT",
//           "naziv": "Informacione tehnologije",
//           "opis": "Studijski program Informacione tehnologije je usaglašen sa dostignutim stepenom razvoja informacionih tehnologija, savremenih veb servisa, internet marketinga, savremenih menadžerskih pristupa i u skladu je sa zahtevima koji proizilaze iz praktične primene saznanja iz ovih oblasti u poslovnim sistemima. Glavna odlika studijskog programa Informacione tehnologije je posvećivanje pažnje internet tehnologijama i veb servisima što je u skladu sa brzim tehnološkim promenama u ovoj oblasti."
//         },
//         {
//           "id": 1,
//           "deleted": false,
//           "akronim": "RN",
//           "naziv": "Računarske nauke",
//           "opis": "Fakultet za Informatiku i računarstvo već više od jedne decenije školuje programere i informatičare specijalizovane za razvoj softvera i informacionu bezbednost. Studenti na ovom studijskom programu, kroz izborne predmete na 3. i 4. godini, mogu izabrati jedno od dva usmerenja: razvoj veb i mobilnih aplikacija ili bezbednost u sajber prostoru."
//         }
//       ],
//       "univerzitet": {
//         "id": 1,
//         "deleted": false,
//         "naziv": "Univerzitet u Beogradu",
//         "opis": "Jedan od vodećih univerziteta u regionu. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam nibh massa, tincidunt porta tristique eu, fringilla non ante. Sed posuere purus enim, in efficitur metus."
//       }
//     },
//     {
//       "id": 3,
//       "deleted": false,
//       "naziv": "Tehnički fakultet",
//       "studijskiProgrami": [
//         {
//           "id": 5,
//           "deleted": false,
//           "akronim": "SII",
//           "naziv": "Softversko inženjerstvo i informacione tehnologije",
//           "opis": "Ovaj studijski program obezbeđuje najšira znanja iz oblasti softverskog i informacionog inženjerstva. Na studijama se izučavaju metodološki aspekti razvoja složenih softverskih i informacionih sistema i najsavremenije prateće, posebno softverske tehnologije za primenu softverskog i informacionog inženjerstva u različitim domenskim oblastima."
//         }
//       ],
//       "univerzitet": {
//         "id": 1,
//         "deleted": false,
//         "naziv": "Univerzitet u Beogradu",
//         "opis": "Jedan od vodećih univerziteta u regionu. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam nibh massa, tincidunt porta tristique eu, fringilla non ante. Sed posuere purus enim, in efficitur metus."
//       }
//     },
//     {
//       "id": 4,
//       "deleted": false,
//       "naziv": "Fakultet za kulturu i menadžment u sportu",
//       "studijskiProgrami": [],
//       "univerzitet": {
//         "id": 1,
//         "deleted": false,
//         "naziv": "Univerzitet u Beogradu",
//         "opis": "Jedan od vodećih univerziteta u regionu. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam nibh massa, tincidunt porta tristique eu, fringilla non ante. Sed posuere purus enim, in efficitur metus."
//       }
//     },
//     {
//       "id": 5,
//       "deleted": false,
//       "naziv": "Farmacija",
//       "studijskiProgrami": [
//         {
//           "id": 7,
//           "deleted": false,
//           "akronim": "FF",
//           "naziv": "Farmacija",
//           "opis": "Karijera u farmaciji je jedna od najprestižnijih karijera u svetu. Raznolikost karijernih puteva, koji postoje u farmaciji je jedan od razloga zašto upisati farmaciju. Od razvoja leka, kliničkog ispitivanja leka, do izdavanja leka odnosno pružanja farmaceutske zdravstvene usluge u apoteci, lako se može odabrati profesionalni put, koji Vas najviše zanima. Nakon završetka studijskog programa Farmacija stičete zvanje Magistar farmacije. Važno je imati na umu da ne morate odmah znati šta tačno želite da radite, jer posedovati diplomu Magistra farmacije je prestižno i otvara Vam vrata nebrojenim mogućnostima za obavljanje profesije farmaceuta."
//         }
//       ],
//       "univerzitet": {
//         "id": 2,
//         "deleted": false,
//         "naziv": "Univerzitet u Novom Sadu",
//         "opis": "Najveći univerzitet u Srbiji. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam vel turpis convallis, scelerisque odio non, mollis mauris. Phasellus sit amet posuere urna. Suspendisse id risus."
//       }
//     },
//   ]

  treeControl!: FlatTreeControl<FlatNode>;
  treeFlattener!: MatTreeFlattener<TreeNode, FlatNode>;
  dataSource!: MatTreeFlatDataSource<TreeNode, FlatNode>;

  constructor(private fakultetService: FakultetService, private studijskiProgramService: StudijskiProgramService, private uniService:UniverzitetService) {
    this.treeFlattener = new MatTreeFlattener<TreeNode, FlatNode>(
      (node, level) => ({
        ...node,
        level,
        expandable: !!node.children && node.children.length > 0
      }),
      node => node.level,
      node => node.expandable,
      node => node.children || []
    );
    
    this.treeControl = new FlatTreeControl<FlatNode>(
      (node) => node.level,
      (node) => node.expandable
    );
    
    this.dataSource = new MatTreeFlatDataSource(this.treeControl, this.treeFlattener);
  }

  ngOnInit(): void {
    this.getFakulteti(); //odkomentarisati
    this.getStudijskiProgrami(); //odkomentarisati
  }
  
  getFakulteti() { //odkomentarisati
    this.uniService.getById(1).subscribe(x => {
      if(x.fakulteti){
        this.fakulteti = x.fakulteti;
        const treeData = this.mapFakultetiToTreeData(this.fakulteti);
        this.dataSource.data = treeData;
      }
      console.log("fakulteti");
      console.log(this.fakulteti);
    });
  }
  
  getStudijskiProgrami(){ //odkomentarisati
    this.uniService.getById(1).subscribe(x => {
      this.studijskiProgrami = [];
      if(x.fakulteti && x.fakulteti){
        for(let fakultet of this.fakulteti){
          if(fakultet.studijskiProgrami){
            for(let st of fakultet.studijskiProgrami)
              this.studijskiProgrami.push({...st});
          }
        }
      }
      console.log("studijski");
      console.log(this.studijskiProgrami);
    });
  }

  mapFakultetiToTreeData(fakulteti: Fakultet[]): TreeNode[] {
    return fakulteti.map(fakultet => {
      const children = fakultet.studijskiProgrami?.map(program => {
        return {
          name: program.naziv || 'Unnamed Program',
          id: program.id
        };
      }) || [];
  
      return {
        name: fakultet.naziv || 'Unnamed Fakultet',
        children
      };
    });
  }
  
  onNodeButtonClick(id: number, event: MouseEvent) {
    event.stopPropagation();
    this.showDetails = true;
    this.studijskiProgram = this.studijskiProgrami.find(program => program.id === id);
    this.selectedProgramId = id;
  }

  toggleDetails(): void {
    this.showDetails = !this.showDetails;
  }

  isStudijskiProgramNode(node: FlatNode): boolean {
    return !!node.id;
  }

  hasChild = (_: number, node: FlatNode) => node.expandable;
}
