import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { EmployComponent } from './employ/employ.component';
import { LoginReactiveComponent } from './login-reactive/login-reactive.component';
import { EmployReactiveComponent } from './employ-reactive/employ-reactive.component';
import { StudentComponent } from './student/student.component';
import { StudentReactiveComponent } from './student-reactive/student-reactive.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    EmployComponent,
    LoginReactiveComponent,
    EmployReactiveComponent,
    StudentComponent,
    StudentReactiveComponent
  ],
  imports: [
    BrowserModule,
    FormsModule, 
    ReactiveFormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
