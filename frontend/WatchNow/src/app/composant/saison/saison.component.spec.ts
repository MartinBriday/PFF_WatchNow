import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SaisonComponent } from './saison.component';

describe('SaisonComponent', () => {
  let component: SaisonComponent;
  let fixture: ComponentFixture<SaisonComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SaisonComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SaisonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
