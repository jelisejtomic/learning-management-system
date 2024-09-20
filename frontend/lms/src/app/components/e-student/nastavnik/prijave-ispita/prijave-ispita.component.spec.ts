import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PrijaveIspitaComponent } from './prijave-ispita.component';

describe('PrijaveIspitaComponent', () => {
  let component: PrijaveIspitaComponent;
  let fixture: ComponentFixture<PrijaveIspitaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PrijaveIspitaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PrijaveIspitaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
