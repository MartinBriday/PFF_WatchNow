import { TestBed } from '@angular/core/testing';

import { OeuvreWatchService } from './oeuvre-watch.service';

describe('OeuvreWatchService', () => {
  let service: OeuvreWatchService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(OeuvreWatchService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
