import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.prod';
import { Trailer } from '../model/trailer.model';

@Injectable({
  providedIn: 'root'
})
export class TrailerService {

  constructor(private httpCLient: HttpClient) { }

  getTrailerByOeuvreId(id:string):Observable<Trailer>
  {
    return this.httpCLient.get<Trailer>(environment.url + "trailer/index/" + id)
  }
}
