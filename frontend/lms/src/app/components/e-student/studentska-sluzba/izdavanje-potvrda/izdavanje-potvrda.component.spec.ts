import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IzdavanjePotvrdaComponent } from './izdavanje-potvrda.component';

describe('IzdavanjePotvrdaComponent', () => {
  let component: IzdavanjePotvrdaComponent;
  let fixture: ComponentFixture<IzdavanjePotvrdaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [IzdavanjePotvrdaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(IzdavanjePotvrdaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
