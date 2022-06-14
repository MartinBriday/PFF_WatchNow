import { environment } from './../../environments/environment.prod';
import { Observable } from 'rxjs';
import { Film } from './../model/film.model';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class FilmService {

  constructor(private httpCLient: HttpClient) { }

  getMostPopularFilm():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film?nbResults=8")
  }
}
