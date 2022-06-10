import { TestBed } from '@angular/core/testing';

import { SynopsisService } from './synopsis.service';

describe('SynopsisService', () => {
  let service: SynopsisService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SynopsisService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
