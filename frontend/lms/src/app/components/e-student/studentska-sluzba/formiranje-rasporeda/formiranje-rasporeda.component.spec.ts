import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormiranjeRasporedaComponent } from './formiranje-rasporeda.component';

describe('FormiranjeRasporedaComponent', () => {
  let component: FormiranjeRasporedaComponent;
  let fixture: ComponentFixture<FormiranjeRasporedaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormiranjeRasporedaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FormiranjeRasporedaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
