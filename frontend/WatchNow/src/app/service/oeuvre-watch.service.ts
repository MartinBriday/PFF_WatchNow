import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.prod';
import { OeuvreWatch } from '../model/oeuvre-watch.model';

@Injectable({
  providedIn: 'root'
})
export class OeuvreWatchService {

  constructor(private httpCLient: HttpClient) { }

  getOeuvreWatchByOeuvreId(id:string):Observable<OeuvreWatch>
  {
    return this.httpCLient.get<OeuvreWatch>(environment.url + "oeuvre_watch/index/" + id)
  }
}

