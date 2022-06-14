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
import { ConditionComponent } from './condition/condition.component';
import { CaseExampleComponent } from './case-example/case-example.component';
import { EmployTableComponent } from './employ-table/employ-table.component';
import { EmployDropDownComponent } from './employ-drop-down/employ-drop-down.component';
import { MenuComponent } from './menu/menu.component';
import { RouterModule, Routes } from '@angular/router';

const appRoutes : Routes = 
[
  {path:'',component:MenuComponent},
  {path:'menu',component:MenuComponent},
  {path:'menu',component:MenuComponent,children:
    [
      {path:'first',component:FirstComponent,outlet:'segue'},
      {path:'second',component:SecondComponent,outlet:'segue'},
      {path:'third',component:ThirdComponent,outlet:'segue'},
      {path:'twoway',component:TwoWayComponent,outlet:'segue'},
      {path:'condition',component:ConditionComponent,outlet:'segue'},
      {path:'calculation',component:CalculationComponent,outlet:'segue'},
      {path:'caseEx',component:CaseExampleComponent,outlet:'segue'},
      {path:'employTable',component:EmployTableComponent,outlet:'segue'},
      {path:'employDropDown',component:EmployDropDownComponent,outlet:'segue'},
    ]
  }
]
// const appRoutes : Routes = 
// [
//   {path:'first',component:FirstComponent},
//   {path:'second',component:SecondComponent},
//   {path:'third',component:ThirdComponent},
//   {path:'twoway',component:TwoWayComponent},
//   {path:'condition',component:ConditionComponent},
//   {path:'calculation',component:CalculationComponent},
//   {path:'caseEx',component:CaseExampleComponent},
//   {path:'employ',component:EmployTableComponent},
//   {path:'employDropDown',component:EmployDropDownComponent},
//   {path:'',component:MenuComponent},  
// ]

@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    SecondComponent,
    ThirdComponent,
    TwoWayComponent,
    CalculationComponent,
    ConditionComponent,
    CaseExampleComponent,
    EmployTableComponent,
    EmployDropDownComponent,
    MenuComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(appRoutes),
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
