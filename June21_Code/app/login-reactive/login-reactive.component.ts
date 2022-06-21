import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-login-reactive',
  templateUrl: './login-reactive.component.html',
  styleUrls: ['./login-reactive.component.css']
})
export class LoginReactiveComponent implements OnInit {

  isFormSubmitted : boolean = null;
  loginForm = new FormGroup({
    userName : new FormControl('',Validators.required),
    passCode : new FormControl('',Validators.required)
  })
  onFormSubmit() {
    this.isFormSubmitted = false;
    if (this.loginForm.invalid) {
      return;
    }
    this.isFormSubmitted=true;
    alert("No Error");
  }
  constructor() { 
    
  }

  ngOnInit(): void {
  }

}
