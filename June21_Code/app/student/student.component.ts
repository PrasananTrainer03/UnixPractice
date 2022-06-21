import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Student } from '../student';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  isValidForm : boolean;
  student : Student;
  submit(studentForm : NgForm) {
    if (studentForm.invalid) {
      return;
    }
    this.isValidForm=true;
    alert("Success");
  }
   constructor() {
    this.student = new Student();
    this.isValidForm=false;
    }

  ngOnInit(): void {
  }

}
