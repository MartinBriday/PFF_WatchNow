import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Oeuvre } from '../model/oeuvre.model';
import { FilmService } from './film.service';
import { SerieService } from './serie.service';

@Injectable({
  providedIn: 'root'
})
export class OeuvreService {

  constructor(private httpCLient: HttpClient, private filmService:FilmService, private serieService:SerieService) { }

  getByKeyword(keyword:string): Observable<Oeuvre[]> {
    return this.httpCLient.get<Oeuvre[]>(environment.url + "oeuvre/index/keyword/" + keyword)
  }

  getByMostPopularByType(type:string) : Observable<any[]> {
    if(type == "film") {
      return this.filmService.getMostPopularFilm();
    }else {
      return this.serieService.getMostPopularSerie();
    }
  }
  
  getByTitre(titre:string): Observable<Oeuvre[]> {
    return this.httpCLient.get<Oeuvre[]>(environment.url +"oeuvre/oeuvre/titre/" + titre + "?nbResults=8")
  }

  getByTitreAndtype(type:string, titre:string): Observable<Oeuvre[]> {
    return this.httpCLient.get<Oeuvre[]>(environment.url +"oeuvre/oeuvre/titre/" + titre + "/type/" + type + "?nbResults=8")
  }

  getByTitreAndAnnee(titre:string, annee:string): Observable<Oeuvre[]> {
    return this.httpCLient.get<Oeuvre[]>(environment.url +"oeuvre/oeuvre/titre/" + titre + "/annee/" + annee + "?nbResults=8")
  }

  getByTitreAndTypeAndAnnee(titre:string, type:string, annee:string): Observable<Oeuvre[]> {
    return this.httpCLient.get<Oeuvre[]>(environment.url +"oeuvre/oeuvre/titre/" + titre + "/type/" + type +"/annee/" + annee + "?nbResults=8")
  }


}
