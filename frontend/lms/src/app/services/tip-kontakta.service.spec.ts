import { TestBed } from '@angular/core/testing';

import { TipKontaktaService } from './tip-kontakta.service';

describe('TipKontaktaService', () => {
  let service: TipKontaktaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TipKontaktaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
