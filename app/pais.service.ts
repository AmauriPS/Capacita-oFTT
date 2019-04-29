import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { findLocaleData } from '@angular/common/src/i18n/locale_data_api';
import { Observable } from 'rxjs';
import { Pais } from './pais';
const httpOptions ={
  headers : new HttpHeaders({
    'Content-Type':'application/json'
  })
}

@Injectable()
export class PaisService {

  url = "http://localhost:8080/api/pais";

  constructor(private http:HttpClient) { }
 
   findAll(): Observable<Pais[]>{
    return this.http.get<Pais[]>(`${this.url}`);
   }

   save(pais:Pais){
     return this.http.post(`${this.url}`,JSON.stringify(pais), httpOptions);
   

}

}
