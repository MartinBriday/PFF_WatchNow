import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeNouveauteComponent } from './liste-nouveaute.component';

describe('ListeNouveauteComponent', () => {
  let component: ListeNouveauteComponent;
  let fixture: ComponentFixture<ListeNouveauteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeNouveauteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeNouveauteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
