import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculation',
  templateUrl: './calculation.component.html',
  styleUrls: ['./calculation.component.css']
})
export class CalculationComponent implements OnInit {

  firstNumber : number;
  secondNumber : number;
  result : number;

  mult() {
    
  }
  sub() {

  }
  sum() {
    this.result = this.firstNumber + this.secondNumber;
  }
  constructor() { }

  ngOnInit(): void {
  }

}
