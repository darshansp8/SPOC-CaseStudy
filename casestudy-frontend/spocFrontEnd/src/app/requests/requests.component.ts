import { Component, OnInit } from '@angular/core';
import { ApiServiceService } from '../api-service.service';
import { Time } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-requests',
  templateUrl: './requests.component.html',
  styleUrls: ['./requests.component.css']
})
export class RequestsComponent implements OnInit {

  public pendingRequests:any = [];
  requestId:number;
  verticalName:string;
  technologyName:string;
  pmName:string;
  candidateCount:number;
  trainingMode:string;
  trainingStartDate:Date;
  trainingEndDate:Date;
  trainingStartTime:Time;
  trainingEndTime:Time;
  comment:any;
  requestStatus:boolean;

  constructor(private api: ApiServiceService, private router: Router) { }

  ngOnInit(): void {
    this.api.getPendingRequest()
    .subscribe(data => {
      this.pendingRequests = Array.from(Object.keys(data), k => data[k]);
    });
    // this.api.currentDetails.subscribe(request => {
    //   this.pendingRequests = Array.from(Object.keys(request), k => request[k]);
    // });
  }

  newData(request: any){
    this.router.navigate(['/viewrequest', request.requestId,request.technologyName,request.candidateCount]);
  }

}
