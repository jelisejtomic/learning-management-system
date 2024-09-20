import { Component, Inject } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogModule, MatDialogRef } from '@angular/material/dialog';
import { Polaganje } from '../../../../../../models/polaganje';
import { MatButtonModule } from '@angular/material/button';
import { DatePipe, NgFor, NgIf } from '@angular/common';

@Component({
  selector: 'app-polaganje-dialog',
  standalone: true,
  imports: [NgFor, DatePipe, MatDialogModule, MatButtonModule],
  templateUrl: './polaganje-dialog.component.html',
  styleUrl: './polaganje-dialog.component.css'
})
export class PolaganjeDialogComponent {
  constructor(
    public dialogRef: MatDialogRef<PolaganjeDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { polaganja: Polaganje[] }
  ) { }

  onNoClick(): void {
    this.dialogRef.close();
  }
}
