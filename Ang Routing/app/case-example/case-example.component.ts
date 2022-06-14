import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-case-example',
  templateUrl: './case-example.component.html',
  styleUrls: ['./case-example.component.css']
})
export class CaseExampleComponent implements OnInit {

  choice : number;
  constructor() { }

  ngOnInit(): void {
  }

}
