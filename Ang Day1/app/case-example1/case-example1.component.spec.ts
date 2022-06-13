import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CaseExample1Component } from './case-example1.component';

describe('CaseExample1Component', () => {
  let component: CaseExample1Component;
  let fixture: ComponentFixture<CaseExample1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CaseExample1Component ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CaseExample1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
