import { TestBed } from '@angular/core/testing';

import { RealisateurService } from './realisateur.service';

describe('RealisateurService', () => {
  let service: RealisateurService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RealisateurService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
