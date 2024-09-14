import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NastavnikPodesavanjaComponent } from './nastavnik-podesavanja.component';

describe('NastavnikPodesavanjaComponent', () => {
  let component: NastavnikPodesavanjaComponent;
  let fixture: ComponentFixture<NastavnikPodesavanjaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [NastavnikPodesavanjaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NastavnikPodesavanjaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
