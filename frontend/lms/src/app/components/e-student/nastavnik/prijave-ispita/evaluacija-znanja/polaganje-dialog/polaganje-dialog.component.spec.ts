import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PolaganjeDialogComponent } from './polaganje-dialog.component';

describe('PolaganjeDialogComponent', () => {
  let component: PolaganjeDialogComponent;
  let fixture: ComponentFixture<PolaganjeDialogComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PolaganjeDialogComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PolaganjeDialogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
