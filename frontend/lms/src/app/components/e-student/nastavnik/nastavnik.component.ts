import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-nastavnik',
  standalone: true,
  imports: [],
  templateUrl: './nastavnik.component.html',
  styleUrl: './nastavnik.component.css'
})
export class NastavnikComponent implements OnInit {
  @Input() username!: string;

  ngOnInit(): void {
    console.log("StudentComponent username: " + this.username)
  }
}
