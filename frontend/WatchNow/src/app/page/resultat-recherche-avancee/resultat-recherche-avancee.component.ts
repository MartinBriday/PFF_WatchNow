import { nullSafeIsEquivalent } from '@angular/compiler/src/output/output_ast';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { OwlOptions } from 'ngx-owl-carousel-o';
import { Observable } from 'rxjs';
import { Oeuvre } from 'src/app/model/oeuvre.model';
import { FilmService } from 'src/app/service/film.service';
import { OeuvreService } from 'src/app/service/oeuvre.service';
import { SerieService } from 'src/app/service/serie.service';

@Component({
  selector: 'app-resultat-recherche-avancee',
  templateUrl: './resultat-recherche-avancee.component.html',
  styleUrls: ['./resultat-recherche-avancee.component.css']
})
export class ResultatRechercheAvanceeComponent implements OnInit {

  type!: string;
  titre!: string;
  annee!:string;
  listeOeuvre$!: Observable<Oeuvre[]>;

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
  constructor(private activatedRoute: ActivatedRoute, private oeuvreService: OeuvreService, private router: Router) {
    this.type = activatedRoute.snapshot.params['type'];
    this.titre = activatedRoute.snapshot.params['titre'];
    this.annee = activatedRoute.snapshot.params['annee'];
  }

  ngOnInit(): void {
    console.log(this.type)
    console.log(this.titre)
    if (this.type != "undefined" && this.titre == "undefined" && this.annee == "undefined") {
      this.listeOeuvre$ = this.oeuvreService.getByMostPopularByType(this.type)
    }
    if (this.type == "undefined" && this.titre != "undefined" && this.annee == "undefined") {
      this.listeOeuvre$ = this.oeuvreService.getByTitre(this.titre)
    }
    if (this.type != "undefined" && this.titre != "undefined" && this.annee == "undefined") {
      this.listeOeuvre$ = this.oeuvreService.getByTitreAndtype(this.type, this.titre)
    }
    if (this.type == "undefined" && this.titre != "undefined" && this.annee != "undefined") {
      this.listeOeuvre$ = this.oeuvreService.getByTitreAndAnnee(this.titre, this.annee)
    }
    if (this.type != "undefined" && this.titre != "undefined" && this.annee != "undefined") {
      this.listeOeuvre$ = this.oeuvreService.getByTitreAndTypeAndAnnee(this.titre, this.type, this.annee)
    }
  }

  ngOnDiplay(l: Oeuvre) {
    if (l.type == "movie") {
      this.router.navigateByUrl("/film/" + l.id)
    } else if (l.type == "tvSeries" || l.type == "tvMiniSeries") {
      this.router.navigateByUrl("/serie/" + l.id)
    } else {
      this.router.navigateByUrl("/erreur404")
    }
  }
}
