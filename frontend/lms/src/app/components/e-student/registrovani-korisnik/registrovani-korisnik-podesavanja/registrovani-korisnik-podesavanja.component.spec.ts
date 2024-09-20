import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistrovaniKorisnikPodesavanjaComponent } from './registrovani-korisnik-podesavanja.component';

describe('RegistrovaniKorisnikPodesavanjaComponent', () => {
  let component: RegistrovaniKorisnikPodesavanjaComponent;
  let fixture: ComponentFixture<RegistrovaniKorisnikPodesavanjaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [RegistrovaniKorisnikPodesavanjaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RegistrovaniKorisnikPodesavanjaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
