import { Injectable } from '@angular/core';
import {loginI} from "../../models/login.interface";
import {responceI} from "../../models/responce.interface";
import {HttpClient, HttpHeaders} from "@angular/common/http"

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http:HttpClient) { }
}
