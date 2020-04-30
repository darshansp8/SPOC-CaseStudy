import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ApiServiceService {

  public requestUrl: string = "http://localhost:8083/show"
  constructor(private http: HttpClient) { }

  getPendingRequest(){
    return this.http.get(this.requestUrl);
  }
}
