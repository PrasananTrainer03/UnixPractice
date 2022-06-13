import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { ThirdComponent } from './third/third.component';
import { TwoWayComponent } from './two-way/two-way.component';
import { CalculationComponent } from './calculation/calculation.component';
import { ConditionExComponent } from './condition-ex/condition-ex.component';
import { CaseExample1Component } from './case-example1/case-example1.component';
import { EmployTableComponent } from './employ-table/employ-table.component';

@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    SecondComponent,
    ThirdComponent,
    TwoWayComponent,
    CalculationComponent,
    ConditionExComponent,
    CaseExample1Component,
    EmployTableComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
