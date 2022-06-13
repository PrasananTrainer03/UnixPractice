import { Component, OnInit } from '@angular/core';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ-table',
  templateUrl: './employ-table.component.html',
  styleUrls: ['./employ-table.component.css']
})
export class EmployTableComponent implements OnInit {

  employs = [
    new Employ(1, "Gaurav","Java","Programmer",84234),
    new Employ(2, "Charan","Dotnet","Developer",91043),
    new Employ(3, "Jayanth","Sql","TeamLead",89042),
    new Employ(4, "Ayushi","Sql","Manager",90422),
    new Employ(5, "Saideepthi","Dotnet","Expert",89042),
    new Employ(6, "Pavan Kalyan","Sql","Production Engineer",80032),
  ]
  constructor() { }

  ngOnInit(): void {
  }

}
