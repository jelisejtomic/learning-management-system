import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PrijavaIspitaPopupComponent } from './prijava-ispita-popup.component';

describe('PrijavaIspitaPopupComponent', () => {
  let component: PrijavaIspitaPopupComponent;
  let fixture: ComponentFixture<PrijavaIspitaPopupComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PrijavaIspitaPopupComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PrijavaIspitaPopupComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
