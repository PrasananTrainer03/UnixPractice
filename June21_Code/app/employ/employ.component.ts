import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ',
  templateUrl: './employ.component.html',
  styleUrls: ['./employ.component.css']
})
export class EmployComponent implements OnInit {

  employ : Employ;
  isValidForm : boolean;
  submit(employForm : NgForm) {
    if (employForm.invalid) {
      return;
    }
    this.isValidForm=true;
  }
  constructor() {
    this.employ = new Employ();
    this.isValidForm=false;
   }

  ngOnInit(): void {
  }

}
