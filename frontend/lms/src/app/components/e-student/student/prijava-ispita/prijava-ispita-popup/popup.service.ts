import { Injectable } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { PrijavaIspitaPopupComponent } from './prijava-ispita-popup.component';

@Injectable({
  providedIn: 'root',
})
export class PopupService {
  constructor(private dialog: MatDialog) {}

  openPopup() {
    this.dialog.open(PrijavaIspitaPopupComponent);
  }
}