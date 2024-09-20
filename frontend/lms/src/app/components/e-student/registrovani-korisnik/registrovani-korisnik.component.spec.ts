import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistrovaniKorisnikComponent } from './registrovani-korisnik.component';

describe('RegistrovaniKorisnikComponent', () => {
  let component: RegistrovaniKorisnikComponent;
  let fixture: ComponentFixture<RegistrovaniKorisnikComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [RegistrovaniKorisnikComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RegistrovaniKorisnikComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
