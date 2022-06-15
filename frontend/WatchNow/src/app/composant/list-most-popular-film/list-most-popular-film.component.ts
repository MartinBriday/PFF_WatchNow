import { FilmService } from './../../service/film.service';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Film } from 'src/app/model/film.model';
import { Router } from '@angular/router';
import { OwlOptions } from 'ngx-owl-carousel-o';

@Component({
  selector: 'app-list-most-popular-film',
  templateUrl: './list-most-popular-film.component.html',
  styleUrls: ['./list-most-popular-film.component.css']
})
export class ListMostPopularFilmComponent implements OnInit {
  id!:string
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

  listMostPopularFilm$!: Observable<Film[]>
  film$!: Observable<Film>
  ngOnInit(): void {
    this.listMostPopularFilm$ = this.filmService.getMostPopularFilm();

  }
  ngOnDiplay(id:string)
  {

    this.router.navigateByUrl("/film/" + id)
  }
  // getMostPopularFilm():Observable<Film[]> {
  //   return
  // }
}
