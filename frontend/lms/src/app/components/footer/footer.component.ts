import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { RouterLink } from '@angular/router';
import { Adresa } from '../../models/adresa';
import { Kontakt } from '../../models/kontakt';
import { AdresaService } from '../../services/adresa.service';
import { KontaktService } from '../../services/kontakt.service';
import { UniverzitetService } from '../../services/univerzitet.service';

@Component({
  selector: 'app-footer',
  standalone: true,
  imports: [RouterLink, CommonModule],
  templateUrl: './footer.component.html',
  styleUrl: './footer.component.css'
})
export class FooterComponent implements OnInit{
  constructor(private adresaService:AdresaService, private kontaktService:KontaktService, private uniService:UniverzitetService){}
  
  adrese: Adresa[] = []
  mejlovi : Kontakt[]= []
  kontakti : Kontakt[]= []

  ngOnInit(): void {
    // TODO hardcodovano je koji je univerzitet
    this.uniService.getById(1).subscribe(x=>{

      if(x.adrese)
        this.adrese = x.adrese;
      if(x.kontakti){
        for(let kontakt of x.kontakti){
          if(kontakt.tipKontakta && kontakt.tipKontakta.naziv == "Email"){
            this.mejlovi.push(kontakt);
          }else{
            this.kontakti.push(kontakt);
          }
        }
      }
    })

  }
}
