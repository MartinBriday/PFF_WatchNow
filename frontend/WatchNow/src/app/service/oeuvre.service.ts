import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Oeuvre } from '../model/oeuvre.model';

@Injectable({
  providedIn: 'root'
})
export class OeuvreService {

  constructor(private httpCLient: HttpClient) { }

  getByKeyword(keyword:string): Observable<Oeuvre[]> {
    return this.httpCLient.get<Oeuvre[]>(environment.url + "oeuvre/index/keyword/" + keyword)
  }
}
