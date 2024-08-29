import { TestBed } from '@angular/core/testing';

import { OdbranaZavrsnogRadaService } from './odbrana-zavrsnog-rada.service';

describe('OdbranaZavrsnogRadaService', () => {
  let service: OdbranaZavrsnogRadaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(OdbranaZavrsnogRadaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
