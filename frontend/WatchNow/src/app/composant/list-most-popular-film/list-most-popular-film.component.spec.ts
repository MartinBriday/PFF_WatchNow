import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListMostPopularFilmComponent } from './list-most-popular-film.component';

describe('ListMostPopularFilmComponent', () => {
  let component: ListMostPopularFilmComponent;
  let fixture: ComponentFixture<ListMostPopularFilmComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListMostPopularFilmComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListMostPopularFilmComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
