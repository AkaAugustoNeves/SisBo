import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ObitoService {

  constructor(private http: HttpClient) { }

  getAll(){
    return this.http.get<any[]>('http://sisbocodegu.herokuapp.com/obito');
  }
}
