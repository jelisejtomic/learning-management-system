import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminOrganizacijeComponent } from './admin-organizacije.component';

describe('AdminOrganizacijeComponent', () => {
  let component: AdminOrganizacijeComponent;
  let fixture: ComponentFixture<AdminOrganizacijeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AdminOrganizacijeComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminOrganizacijeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
