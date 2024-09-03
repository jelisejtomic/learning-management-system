import { Component } from '@angular/core';
import { FooterComponent } from '../footer/footer.component';
import { HeaderComponent } from '../header/header.component';

@Component({
  selector: 'app-zaposleni',
  standalone: true,
  imports: [HeaderComponent, FooterComponent],
  templateUrl: './zaposleni.component.html',
  styleUrl: './zaposleni.component.css'
})
export class ZaposleniComponent {

}
