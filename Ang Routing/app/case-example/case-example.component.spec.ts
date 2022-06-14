import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CaseExampleComponent } from './case-example.component';

describe('CaseExampleComponent', () => {
  let component: CaseExampleComponent;
  let fixture: ComponentFixture<CaseExampleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CaseExampleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CaseExampleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
