import { UtilisateurService } from './../../service/utilisateur.service';
import { SerieService } from 'src/app/service/serie.service';
import { OwlOptions } from 'ngx-owl-carousel-o';
import { Film } from 'src/app/model/film.model';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';
import { FilmService } from 'src/app/service/film.service';
import { Component, OnInit } from '@angular/core';
import { Utilisateur } from 'src/app/model/utilisateur.model';

@Component({
  selector: 'app-mon-compte',
  templateUrl: './mon-compte.component.html',
  styleUrls: ['./mon-compte.component.css']
})
export class MonCompteComponent implements OnInit {
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
  utilisateur$!: Observable<Utilisateur>
  listSeriesEnCours$!: Observable<Film[]>;
  listFilmsEnCours$!: Observable<Film[]>;
  listSeriesLater$!: Observable<Film[]>;
  listFilmsLater$!: Observable<Film[]>;
  listSeriesVu$!: Observable<Film[]>;
  listFilmsVu$!: Observable<Film[]>;

  constructor(private utilisateurService: UtilisateurService, private filmService: FilmService, private serieService: SerieService, private router: Router) { }

  ngOnInit(): void {
    this.utilisateur$ = this.utilisateurService.getByLogin(sessionStorage.getItem('username'))

    this.listSeriesEnCours$ = this.serieService.getlistSeriesEnCours();
    this.listFilmsEnCours$ = this.filmService.getlistFilmsEnCours();

    this.listSeriesLater$ = this.serieService.getlistSeriesLater();
    this.listFilmsLater$ = this.filmService.getlistFilmsLater();

    this.listSeriesVu$ = this.serieService.getlistSeriesVu();
    this.listFilmsVu$ = this.filmService.getlistFilmsVu();
  }

}
