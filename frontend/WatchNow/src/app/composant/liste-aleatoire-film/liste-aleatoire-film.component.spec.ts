import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeAleatoireFilmComponent } from './liste-aleatoire-film.component';

describe('ListeAleatoireFilmComponent', () => {
  let component: ListeAleatoireFilmComponent;
  let fixture: ComponentFixture<ListeAleatoireFilmComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeAleatoireFilmComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeAleatoireFilmComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
