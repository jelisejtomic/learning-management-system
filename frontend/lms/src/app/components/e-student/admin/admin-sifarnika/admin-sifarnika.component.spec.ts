import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminSifarnikaComponent } from './admin-sifarnika.component';

describe('AdminSifarnikaComponent', () => {
  let component: AdminSifarnikaComponent;
  let fixture: ComponentFixture<AdminSifarnikaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AdminSifarnikaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminSifarnikaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
