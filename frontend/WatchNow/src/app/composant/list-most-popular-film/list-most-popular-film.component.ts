import { FilmService } from './../../service/film.service';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Film } from 'src/app/model/film.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-most-popular-film',
  templateUrl: './list-most-popular-film.component.html',
  styleUrls: ['./list-most-popular-film.component.css']
})
export class ListMostPopularFilmComponent implements OnInit {

  constructor(private filmService: FilmService, private router: Router) { }

  listMostPopularFilm$!: Observable<Film[]>

  ngOnInit(): void {

  }

  getMostPopularFilm():Observable<Film[]> {
    return
  }
}
