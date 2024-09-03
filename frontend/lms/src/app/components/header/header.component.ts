import { Component } from '@angular/core';
import { KontaktComponent } from '../kontakt/kontakt.component';
import { RouterLink } from '@angular/router';
import { ZaposleniComponent } from '../zaposleni/zaposleni.component';

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [RouterLink, KontaktComponent, ZaposleniComponent],
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent {
}
