import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ObjavljivanjeObavestenjaComponent } from './objavljivanje-obavestenja.component';

describe('ObjavljivanjeObavestenjaComponent', () => {
  let component: ObjavljivanjeObavestenjaComponent;
  let fixture: ComponentFixture<ObjavljivanjeObavestenjaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ObjavljivanjeObavestenjaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ObjavljivanjeObavestenjaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
