import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeAleatoireSerieComponent } from './liste-aleatoire-serie.component';

describe('ListeAleatoireSerieComponent', () => {
  let component: ListeAleatoireSerieComponent;
  let fixture: ComponentFixture<ListeAleatoireSerieComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeAleatoireSerieComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeAleatoireSerieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
