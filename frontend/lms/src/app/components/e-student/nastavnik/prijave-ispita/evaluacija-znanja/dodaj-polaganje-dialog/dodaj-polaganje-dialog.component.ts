import { Component, EventEmitter, Inject, Output } from '@angular/core';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MAT_DIALOG_DATA, MatDialogModule, MatDialogRef } from '@angular/material/dialog';
import { MatInputModule } from '@angular/material/input';
import { Polaganje } from '../../../../../../models/polaganje';
import { MatButtonModule } from '@angular/material/button';
import { FormBuilder, FormGroup, FormsModule, Validators } from '@angular/forms';
import { NgIf } from '@angular/common';
import { PolaganjeService } from '../../../../../../services/polaganje.service';

@Component({
  selector: 'app-dodaj-polaganje-dialog',
  standalone: true,
  imports: [NgIf, FormsModule, MatDialogModule, MatFormFieldModule, MatInputModule, MatButtonModule],
  templateUrl: './dodaj-polaganje-dialog.component.html',
  styleUrl: './dodaj-polaganje-dialog.component.css'
})
export class DodajPolaganjeDialogComponent {
  @Output() polaganjeAdded = new EventEmitter<void>();
  form: FormGroup;

  constructor(
    public dialogRef: MatDialogRef<DodajPolaganjeDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    private polaganjeService: PolaganjeService,
    private fb: FormBuilder
  ) {
    this.form = this.fb.group({
      bodovi: [null, [Validators.required, Validators.min(0), Validators.max(data.evaluacijaZnanja.maxBodovi ?? 100)],
      ], napomena: [''],
    });
  }

  onNoClick(): void {
    this.dialogRef.close();
  }

  dodajPolaganje(): void {
    if (this.isValid()) {
      this.dialogRef.close(this.data);
      this.createPolaganje(this.data);
    } else {
      const maxBodovi = this.data.evaluacijaZnanja.maxBodovi ?? 100;
      alert(`Bodovi moraju biti u opsegu od 0 do ${maxBodovi}`);
    }
  }

  createPolaganje(data: Polaganje) {
    this.polaganjeService.create(data).subscribe(() => {
      this.polaganjeAdded.emit();
    })
  }

  isValid(): boolean {
    return this.data.bodovi >= 0 && this.data.bodovi <= (this.data.evaluacijaZnanja.maxBodovi ?? 100);
  }
}
