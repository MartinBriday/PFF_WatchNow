import { OwlOptions } from 'ngx-owl-carousel-o';
import { Film } from 'src/app/model/film.model';
import { delay, Observable } from 'rxjs';
import { Router } from '@angular/router';
import { FilmService } from './../../service/film.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-categorie-film',
  templateUrl: './categorie-film.component.html',
  styleUrls: ['./categorie-film.component.css']
})
export class CategorieFilmComponent implements OnInit {
  customOptions: OwlOptions = {
    loop: true,
    mouseDrag: true,
    touchDrag: true,
    pullDrag: false,
    dots: false,
    navSpeed: 700,
    navText: ['', ''],
    margin: 20,
    stagePadding: 20,
    autoplay: true,
    responsive: {
      0: {
        items: 1
      },
      400: {
        items: 2
      },
      740: {
        items: 3
      },
      940: {
        items: 4
      }
    },
    nav: true
  }
  constructor(private filmService: FilmService, private router: Router) { }

  listMostPopularFilmByGenreAction$!: Observable<Film[]>;
  listMostPopularFilmByGenreHorror$!: Observable<Film[]>;
  listMostPopularFilmByGenreCrime$!: Observable<Film[]>;
  listMostPopularFilmByGenreAnimation$!: Observable<Film[]>;

  ngOnInit(): void {
    this.listMostPopularFilmByGenreAction$ = this.filmService.getMostPopularFilmByGenreAction();

    // setTimeout(function(){
    //   console.log("Ready");
    //   this.listMostPopularFilmByGenreAction$ = this.filmService.getMostPopularFilmByGenreAction();
    //   }, 5000);
    // this.listMostPopularFilmByGenreHorror$ = this.filmService.getMostPopularFilmByGenreHorror();
    // this.listMostPopularFilmByGenreCrime$ = this.filmService.getMostPopularFilmByGenreCrime();
    // this.listMostPopularFilmByGenreAnimation$ = this.filmService.getMostPopularFilmByGenreAnimation();
  }

}
