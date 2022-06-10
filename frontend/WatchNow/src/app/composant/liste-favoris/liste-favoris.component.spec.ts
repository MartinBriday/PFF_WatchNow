import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeFavorisComponent } from './liste-favoris.component';

describe('ListeFavorisComponent', () => {
  let component: ListeFavorisComponent;
  let fixture: ComponentFixture<ListeFavorisComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeFavorisComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeFavorisComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
