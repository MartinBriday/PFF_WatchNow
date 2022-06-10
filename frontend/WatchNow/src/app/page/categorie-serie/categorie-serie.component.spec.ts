import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategorieSerieComponent } from './categorie-serie.component';

describe('CategorieSerieComponent', () => {
  let component: CategorieSerieComponent;
  let fixture: ComponentFixture<CategorieSerieComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CategorieSerieComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CategorieSerieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
