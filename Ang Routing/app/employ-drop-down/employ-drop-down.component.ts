import { Component, OnInit } from '@angular/core';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ-drop-down',
  templateUrl: './employ-drop-down.component.html',
  styleUrls: ['./employ-drop-down.component.css']
})
export class EmployDropDownComponent implements OnInit {

  ename : string;
  employs= [
    new Employ(1,"Saritha","Java","Programmer",83234),
    new Employ(2,"Niharika","Angular","Expert",90332),
    new Employ(3,"Ramya","Sql","Developer",90324),
    new Employ(4,"Trinath","Angular","Expert",98223),
    new Employ(5,"Mohith","Sql","Manager",98423),
  ]

  constructor() { }

  ngOnInit(): void {
  }

}
