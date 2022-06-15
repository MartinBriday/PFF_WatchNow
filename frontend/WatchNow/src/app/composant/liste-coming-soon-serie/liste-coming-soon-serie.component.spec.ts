import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeComingSoonSerieComponent } from './liste-coming-soon-serie.component';

describe('ListeComingSoonSerieComponent', () => {
  let component: ListeComingSoonSerieComponent;
  let fixture: ComponentFixture<ListeComingSoonSerieComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeComingSoonSerieComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeComingSoonSerieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
