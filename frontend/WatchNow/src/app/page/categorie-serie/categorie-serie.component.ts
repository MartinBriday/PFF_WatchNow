import { Observable } from 'rxjs';
import { Serie } from './../../model/serie.model';
import { Router } from '@angular/router';
import { SerieService } from './../../service/serie.service';
import { OwlOptions } from 'ngx-owl-carousel-o';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-categorie-serie',
  templateUrl: './categorie-serie.component.html',
  styleUrls: ['./categorie-serie.component.css']
})
export class CategorieSerieComponent implements OnInit {
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
  constructor(private serieService: SerieService, private router: Router) { }

  listMostPopularSerieByGenreAction$!: Observable<Serie[]>;
  listMostPopularSerieByGenreHorror$!: Observable<Serie[]>;
  listMostPopularSerieByGenreCrime$!: Observable<Serie[]>;
  listMostPopularSerieByGenreAnimation$!: Observable<Serie[]>;

  ngOnInit(): void {
    this.listMostPopularSerieByGenreAction$ = this.serieService.getMostPopularSerieByGenreAction();
    this.listMostPopularSerieByGenreHorror$ = this.serieService.getMostPopularSerieByGenreHorror();
    this.listMostPopularSerieByGenreCrime$ = this.serieService.getMostPopularSerieByGenreCrime();
    this.listMostPopularSerieByGenreAnimation$ = this.serieService.getMostPopularSerieByGenreAnimation();
}
}
