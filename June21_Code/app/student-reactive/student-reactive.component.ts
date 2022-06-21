import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-student-reactive',
  templateUrl: './student-reactive.component.html',
  styleUrls: ['./student-reactive.component.css']
})
export class StudentReactiveComponent implements OnInit {

  isValidFormSubmitted: boolean = null;
	studentForm = new FormGroup({
     sno: new FormControl('', Validators.required),
     name: new FormControl('', Validators.required),
     city: new FormControl('', Validators.required),
     cgp: new FormControl('', Validators.required),
  });
  onFormSubmit() {
    this.isValidFormSubmitted = false;
    if(this.studentForm.invalid){
     return;	
    } 	
    this.isValidFormSubmitted = true;	
    console.log(this.studentForm.valid);
  }
  constructor() { }

  ngOnInit(): void {
  }

}
