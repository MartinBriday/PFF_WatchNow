import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Serie } from '../model/serie.model';

@Injectable({
  providedIn: 'root'
})
export class SerieService {
  constructor(private httpCLient: HttpClient) { }

  getMostPopularSerie():Observable<Serie[]> {
    return this.httpCLient.get<Serie[]>(environment.url + "oeuvre/index/type/serie?nbResults=8")
  }

  getComingSoonSerie():Observable<Serie[]> {
    return this.httpCLient.get<Serie[]>(environment.url + "oeuvre/index/coming_soon/type/serie?nbResults=8")
  }

  getOeuvreByIdSerie(id:string):Observable<Serie>
  {
    return this.httpCLient.get<Serie>(environment.url + "oeuvre/oeuvre/id/" + id)
  }
}
