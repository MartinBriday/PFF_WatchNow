import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeComingSoonFilmComponent } from './liste-coming-soon-film.component';

describe('ListeComingSoonFilmComponent', () => {
  let component: ListeComingSoonFilmComponent;
  let fixture: ComponentFixture<ListeComingSoonFilmComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeComingSoonFilmComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeComingSoonFilmComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
