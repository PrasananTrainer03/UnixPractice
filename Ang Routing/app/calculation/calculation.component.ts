import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculation',
  templateUrl: './calculation.component.html',
  styleUrls: ['./calculation.component.css']
})
export class CalculationComponent implements OnInit {

  firstNo : number;
  secondNo : number;
  result : number;
  sum() {
    this.result = this.firstNo + this.secondNo;
  } 
  constructor() { }

  ngOnInit(): void {
  }

}
