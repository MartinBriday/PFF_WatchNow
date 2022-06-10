import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeDejaVuComponent } from './liste-deja-vu.component';

describe('ListeDejaVuComponent', () => {
  let component: ListeDejaVuComponent;
  let fixture: ComponentFixture<ListeDejaVuComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeDejaVuComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeDejaVuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
