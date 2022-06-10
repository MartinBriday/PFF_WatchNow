import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategorieFilmComponent } from './categorie-film.component';

describe('CategorieFilmComponent', () => {
  let component: CategorieFilmComponent;
  let fixture: ComponentFixture<CategorieFilmComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CategorieFilmComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CategorieFilmComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
