import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  userName : string;
  passCode : string;

  isValidForm : boolean;
  login(loginForm : NgForm) {
   // alert(this.isValidForm);
    if (loginForm.invalid) {
      return;
    } 
    this.isValidForm=true;
      if (this.userName=="Ramya" && this.passCode=="Ramya") {
        alert("Correct...");
      }
    
  }
  constructor() { 
    this.isValidForm=false;
  }

  ngOnInit(): void {
  }

}
