import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BoutonVuOuNonComponent } from './bouton-vu-ou-non.component';

describe('BoutonVuOuNonComponent', () => {
  let component: BoutonVuOuNonComponent;
  let fixture: ComponentFixture<BoutonVuOuNonComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BoutonVuOuNonComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BoutonVuOuNonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
