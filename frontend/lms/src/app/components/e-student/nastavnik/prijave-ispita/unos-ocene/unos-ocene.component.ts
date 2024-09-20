import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MatFormFieldModule } from '@angular/material/form-field';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { Student } from '../../../../../models/student';
import { RealizacijaPredmeta } from '../../../../../models/realizacija-predmeta';
import { PohadjanjePredmeta } from '../../../../../models/pohadjanje-predmeta';
import { PohadjanjePredmetaService } from '../../../../../services/pohadjanje-predmeta.service';


@Component({
  selector: 'app-unos-ocene',
  standalone: true,
  imports: [ReactiveFormsModule, MatInputModule, MatButtonModule, MatFormFieldModule],
  templateUrl: './unos-ocene.component.html',
  styleUrl: './unos-ocene.component.css'
})
export class UnosOceneComponent implements OnInit {
  @Input() student!: Student;
  @Input() realizacijaPredmeta!: RealizacijaPredmeta;
  form: FormGroup;

  constructor(private fb: FormBuilder, private pohadjanjePredmeteaService: PohadjanjePredmetaService, private router: Router) {
    this.form = this.fb.group({
      konacnaOcena: [null, [Validators.required, Validators.min(5), Validators.max(10)]],
      bodovi: [null, [Validators.required, Validators.min(0), Validators.max(100)]],
      bonusBodovi: [null, [Validators.required, Validators.min(0), Validators.max(20)]],
    });
  }

  ngOnInit(): void {
  }

  onSave(): void {
    if (this.form.valid) {
      const data: PohadjanjePredmeta = {
        ...this.form.value,
        student: this.student,
        realizacijaPredmeta: this.realizacijaPredmeta,
      };

      console.log('onSave data ', data)
      this.createPohadjanjePredmeta(data);
    } else {
      alert('Sva polja su obavezna i moraju biti u odgovarajućem opsegu!');
    }
  }

  createPohadjanjePredmeta(data: PohadjanjePredmeta) {
    this.pohadjanjePredmeteaService.create(data).subscribe(response => {
      console.log('Ocena upisana: ', response);
      this.router.navigate(['/nastavnik/predmeti', this.realizacijaPredmeta.id]);
    });
  };
}
