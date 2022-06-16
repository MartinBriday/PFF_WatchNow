import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.prod';
import { Episode } from '../model/episode.model';

@Injectable({
  providedIn: 'root'
})
export class EpisodeService {

  constructor(private httpCLient: HttpClient) { }

  getEpisodeById(id:string):Observable<Episode>
  {
    return this.httpCLient.get<Episode>(environment.url + "oeuvre/oeuvre/id/" + id)
  }
}
