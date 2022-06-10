import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BarPourcentageComponent } from './bar-pourcentage.component';

describe('BarPourcentageComponent', () => {
  let component: BarPourcentageComponent;
  let fixture: ComponentFixture<BarPourcentageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BarPourcentageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BarPourcentageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
