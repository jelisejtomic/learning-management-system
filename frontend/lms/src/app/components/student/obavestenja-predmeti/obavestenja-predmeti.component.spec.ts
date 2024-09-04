import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ObavestenjaPredmetiComponent } from './obavestenja-predmeti.component';

describe('ObavestenjaPredmetiComponent', () => {
  let component: ObavestenjaPredmetiComponent;
  let fixture: ComponentFixture<ObavestenjaPredmetiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ObavestenjaPredmetiComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ObavestenjaPredmetiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
