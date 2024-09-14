import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentskaSluzbaPodesavanjaComponent } from './studentska-sluzba-podesavanja.component';

describe('StudentskaSluzbaPodesavanjaComponent', () => {
  let component: StudentskaSluzbaPodesavanjaComponent;
  let fixture: ComponentFixture<StudentskaSluzbaPodesavanjaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [StudentskaSluzbaPodesavanjaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(StudentskaSluzbaPodesavanjaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
