import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DodajPolaganjeDialogComponent } from './dodaj-polaganje-dialog.component';

describe('DodajPolaganjeDialogComponent', () => {
  let component: DodajPolaganjeDialogComponent;
  let fixture: ComponentFixture<DodajPolaganjeDialogComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DodajPolaganjeDialogComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DodajPolaganjeDialogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
