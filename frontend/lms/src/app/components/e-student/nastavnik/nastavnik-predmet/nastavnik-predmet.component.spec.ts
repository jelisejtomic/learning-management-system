import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NastavnikPredmetComponent } from './nastavnik-predmet.component';

describe('NastavnikPredmetComponent', () => {
  let component: NastavnikPredmetComponent;
  let fixture: ComponentFixture<NastavnikPredmetComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [NastavnikPredmetComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NastavnikPredmetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
