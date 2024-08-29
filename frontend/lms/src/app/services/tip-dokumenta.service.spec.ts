import { TestBed } from '@angular/core/testing';

import { TipDokumentaService } from './tip-dokumenta.service';

describe('TipDokumentaService', () => {
  let service: TipDokumentaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TipDokumentaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
