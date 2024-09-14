import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminStudijskihProgramaComponent } from './admin-studijskih-programa.component';

describe('AdminStudijskihProgramaComponent', () => {
  let component: AdminStudijskihProgramaComponent;
  let fixture: ComponentFixture<AdminStudijskihProgramaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AdminStudijskihProgramaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminStudijskihProgramaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
