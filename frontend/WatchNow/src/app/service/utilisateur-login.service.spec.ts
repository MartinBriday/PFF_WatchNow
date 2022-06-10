import { TestBed } from '@angular/core/testing';

import { UtilisateurLoginService } from './utilisateur-login.service';

describe('UtilisateurLoginService', () => {
  let service: UtilisateurLoginService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UtilisateurLoginService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
