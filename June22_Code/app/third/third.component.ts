import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-third',
  templateUrl: './third.component.html',
  styleUrls: ['./third.component.css']
})
export class ThirdComponent implements OnInit {

  trainer : string;
  company : string;
  constructor(private _activateRoute : ActivatedRoute) {
    this.trainer = this._activateRoute.snapshot.params["trainer"]
    this.company = this._activateRoute.snapshot.params["company"]
   }

  ngOnInit(): void {
  }

}
