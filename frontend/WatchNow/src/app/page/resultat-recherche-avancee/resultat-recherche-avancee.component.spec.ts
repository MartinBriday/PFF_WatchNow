import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ResultatRechercheAvanceeComponent } from './resultat-recherche-avancee.component';

describe('ResultatRechercheAvanceeComponent', () => {
  let component: ResultatRechercheAvanceeComponent;
  let fixture: ComponentFixture<ResultatRechercheAvanceeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ResultatRechercheAvanceeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ResultatRechercheAvanceeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
