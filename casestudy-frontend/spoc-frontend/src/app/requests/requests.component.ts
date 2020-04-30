import { Component, OnInit } from '@angular/core';
import { ApiServiceService } from '../api-service.service';
import { Time } from '@angular/common';

@Component({
  selector: 'app-requests',
  templateUrl: './requests.component.html',
  styleUrls: ['./requests.component.css']
})
export class RequestsComponent implements OnInit {

  public pendingRequests:any [];
  requestId:number;
  verticalId:number;
  technologyId:number;
  pmName:string;
  candidateCount:number;
  trainingMode:string;
  trainingStartDate:Date;
  trainingEndDate:Date;
  trainingStartTime:Time;
  trainingEndTime:Time;
  comment:any;
  requestStatus:boolean;

  constructor(private api: ApiServiceService) { }

  ngOnInit(): void {
    this.api.getPendingRequest()
    .subscribe(data => {
      this.pendingRequests = Array.from(Object.keys(data), k => data[k]);
    });
  }



}
