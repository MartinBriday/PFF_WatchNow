import { TestBed } from '@angular/core/testing';

import { ActeurService } from './acteur.service';

describe('ActeurService', () => {
  let service: ActeurService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ActeurService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
