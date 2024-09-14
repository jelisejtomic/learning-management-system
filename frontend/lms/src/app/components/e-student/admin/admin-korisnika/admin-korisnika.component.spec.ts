import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminKorisnikaComponent } from './admin-korisnika.component';

describe('AdminKorisnikaComponent', () => {
  let component: AdminKorisnikaComponent;
  let fixture: ComponentFixture<AdminKorisnikaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AdminKorisnikaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminKorisnikaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
