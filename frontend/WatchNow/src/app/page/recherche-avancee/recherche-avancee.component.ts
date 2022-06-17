import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FilmService } from 'src/app/service/film.service';
import { OeuvreService } from 'src/app/service/oeuvre.service';
import { SerieService } from 'src/app/service/serie.service';

@Component({
  selector: 'app-recherche-avancee',
  templateUrl: './recherche-avancee.component.html',
  styleUrls: ['./recherche-avancee.component.css']
})
export class RechercheAvanceeComponent implements OnInit {

  searchWord!: string
  type!: string
  titre!: string
  annee!:number

  constructor(private oeuvreService:OeuvreService, private filmService:FilmService, private serieService:SerieService, private router:Router) { }

  ngOnInit(): void {
  }

  searchThis() {
    this.router.navigateByUrl("/recherche/" + this.searchWord);
  }

  onSubmitRechercheAv() {
    this.router.navigateByUrl("/resultatRechercheAvancee/type/" + this.type + "/titre/" + this.titre + "/annee/" + this.annee);
  }

}
