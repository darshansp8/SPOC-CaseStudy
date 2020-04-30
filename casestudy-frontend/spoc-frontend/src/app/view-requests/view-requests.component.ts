import { Component, OnInit } from '@angular/core';
import { ApiServiceService } from '../api-service.service';
import { Time } from '@angular/common';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-view-requests',
  templateUrl: './view-requests.component.html',
  styleUrls: ['./view-requests.component.css']
})
export class ViewRequestsComponent implements OnInit {

  // isChecked: boolean;
  isCheckedTrainerName: any;
  isCheckedRoomName: any;
  isCheckedTrainer: boolean;
  isCheckedRoom: boolean;
  trainerSet: boolean;
  roomSet: boolean;
  trainer: any = [
    {id: 1, name: "Darshan", contact: "978782983"},
    {id: 2, name: "Heet", contact: "978782435"},
    {id: 3, name: "Kacela", contact: "878782983"},
    {id: 4, name: "Unnati", contact: "888782983"}
  ];

  room: any = [
    {id: 1, number: 123, capacity: 30},
    {id: 2, number: 124, capacity: 32},
    {id: 3, number: 125, capacity: 23},
    {id: 4, number: 125, capacity: 25}
  ];

  public singleRequest: any=[];
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

  public request_id:any;

  constructor(private api: ApiServiceService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    let id = this.route.snapshot.paramMap.get('id');
    this.request_id = id;
    // console.log(this.request_id);
    this.api.getRequestById(this.request_id)
    .subscribe(data => 
      this.singleRequest = data);
    console.log(this.singleRequest);
  }

  selectCheckboxTrainer(e){
    this.isCheckedTrainer = !this.isCheckedTrainer;
    this.isCheckedTrainerName = e.target.name;
  }

  selectCheckboxRoom(e){
    this.isCheckedRoom = !this.isCheckedRoom;
    this.isCheckedRoomName = e.target.name;
  }
}
