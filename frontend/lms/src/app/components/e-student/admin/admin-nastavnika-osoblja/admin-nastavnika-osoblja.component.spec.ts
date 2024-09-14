import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminNastavnikaOsobljaComponent } from './admin-nastavnika-osoblja.component';

describe('AdminNastavnikaOsobljaComponent', () => {
  let component: AdminNastavnikaOsobljaComponent;
  let fixture: ComponentFixture<AdminNastavnikaOsobljaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AdminNastavnikaOsobljaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminNastavnikaOsobljaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
