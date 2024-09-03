import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Nastavnik } from '../../models/nastavnik';
import { UniverzitetService } from '../../services/univerzitet.service';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit{
  constructor(private uniService:UniverzitetService){}

  rektor : Nastavnik | undefined = undefined;

  ngOnInit(): void {
    this.uniService.getById(1).subscribe(x=>{
      console.log(x);
      if(x.rektor)
        this.rektor = x.rektor;
    })
  }
}
