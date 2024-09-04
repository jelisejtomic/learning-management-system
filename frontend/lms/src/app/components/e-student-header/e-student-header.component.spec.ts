import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EStudentHeaderComponent } from './e-student-header.component';

describe('EStudentHeaderComponent', () => {
  let component: EStudentHeaderComponent;
  let fixture: ComponentFixture<EStudentHeaderComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EStudentHeaderComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EStudentHeaderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
