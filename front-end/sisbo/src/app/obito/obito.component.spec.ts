import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ObitoComponent } from './obito.component';

describe('ObitoComponent', () => {
  let component: ObitoComponent;
  let fixture: ComponentFixture<ObitoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ObitoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ObitoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
