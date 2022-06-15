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

  getMostPopularFilmByGenreAction():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/action?nbResults=3")
  }

  getMostPopularFilmByGenreHorror():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/horror?nbResults=3")
  }

  getMostPopularFilmByGenreCrime():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/crime?nbResults=3")
  }

  getMostPopularFilmByGenreAnimation():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/animation?nbResults=3")
  }

  getMostPopularFilmByGenreAdventure():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/adventure?nbResults=3")
  }

  getMostPopularFilmByGenreFantasy():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/fantasy?nbResults=3")
  }

  getMostPopularFilmByGenreGameShow():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/game-show?nbResults=3")
  }

  getMostPopularFilmByGenreHistory():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/history?nbResults=3")
  }

  getMostPopularFilmByGenreMusic():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/music?nbResults=3")
  }

  getMostPopularFilmByGenreFilmNoir():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/film-noir?nbResults=3")
  }

  getMostPopularFilmByGenreBiography():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/biography?nbResults=3")
  }

  getMostPopularFilmByGenreComedy():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/comedy?nbResults=3")
  }

  getMostPopularFilmByGenreDocumentary():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/documentary?nbResults=3")
  }

  getMostPopularFilmByGenreDrama():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/drama?nbResults=3")
  }

  getMostPopularFilmByGenreFamily():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/family?nbResults=3")
  }

  getMostPopularFilmByGenreMystery():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/mystery?nbResults=3")
  }

  getMostPopularFilmByGenreNews():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/news?nbResults=3")
  }

  getMostPopularFilmByGenreRealityTV():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/reality-tv?nbResults=3")
  }

  getMostPopularFilmByGenreSport():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/sport?nbResults=3")
  }

  getMostPopularFilmByGenreWar():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/war?nbResults=3")
  }

  getMostPopularFilmByGenreWestern():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/western?nbResults=3")
  }

  getMostPopularFilmByGenreTalkShow():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/talk-show?nbResults=3")
  }

  getMostPopularFilmByGenreThriller():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/thriller?nbResults=3")
  }

  getMostPopularFilmByGenreShort():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/short?nbResults=3")
  }

  getMostPopularFilmByGenreSciFi():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/sci-fi?nbResults=3")
  }

  getMostPopularFilmByGenreRomance():Observable<Film[]> {
    return this.httpCLient.get<Film[]>(environment.url + "oeuvre/index/type/film/genre/romance?nbResults=3")
  }
}
