import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.prod';
import { Synopsis } from '../model/synopsis.model';

@Injectable({
  providedIn: 'root'
})
export class SynopsisService {

  constructor(private httpCLient: HttpClient) { }

  getSynopsisByOeuvreId(id:string):Observable<Synopsis>
  {
    return this.httpCLient.get<Synopsis>(environment.url + "synopsis/index/" + id)
  }
}
