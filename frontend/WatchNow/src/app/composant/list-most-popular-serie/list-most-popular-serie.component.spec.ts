import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListMostPopularSerieComponent } from './list-most-popular-serie.component';

describe('ListMostPopularSerieComponent', () => {
  let component: ListMostPopularSerieComponent;
  let fixture: ComponentFixture<ListMostPopularSerieComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListMostPopularSerieComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListMostPopularSerieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
