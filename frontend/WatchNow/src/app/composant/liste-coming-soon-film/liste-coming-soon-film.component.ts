import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { OwlOptions } from 'ngx-owl-carousel-o';
import { Observable } from 'rxjs';
import { Film } from 'src/app/model/film.model';
import { FilmService } from 'src/app/service/film.service';

@Component({
  selector: 'app-liste-coming-soon-film',
  templateUrl: './liste-coming-soon-film.component.html',
  styleUrls: ['./liste-coming-soon-film.component.css']
})
export class ListeComingSoonFilmComponent implements OnInit {
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

  listeComingSoonFilm$!: Observable<Film[]>

  ngOnInit(): void {
    this.listeComingSoonFilm$ = this.filmService.getComingSoonFilm();
  }

  ngOnDiplay(id:string)
  {
    this.router.navigateByUrl("/film/" + id)
  }

}
