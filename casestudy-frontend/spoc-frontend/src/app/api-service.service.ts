import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class ApiServiceService {

  public requestUrl: string = "http://localhost:8083/show";
  public singleRequestUrl: string = "http://localhost:8083/show/";
  constructor(private http: HttpClient) { }

  getPendingRequest(){
    // console.log(this.http.get(this.requestUrl));
    return this.http.get(this.requestUrl);
  }

  getRequestById(id){
    // console.log(this.http.get(this.singleRequestUrl+id));
    return this.http.get(this.singleRequestUrl+id);
  }


}
