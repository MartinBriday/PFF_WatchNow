import { TestBed } from '@angular/core/testing';

import { NationaliteService } from './nationalite.service';

describe('NationaliteService', () => {
  let service: NationaliteService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NationaliteService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
