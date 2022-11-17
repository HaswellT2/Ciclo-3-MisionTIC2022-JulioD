import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MainvComponent } from './mainv.component';

describe('MainvComponent', () => {
  let component: MainvComponent;
  let fixture: ComponentFixture<MainvComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MainvComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MainvComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
