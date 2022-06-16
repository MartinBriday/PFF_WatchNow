import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { OwlOptions } from 'ngx-owl-carousel-o';
import { Observable } from 'rxjs';
import { Oeuvre } from 'src/app/model/oeuvre.model';
import { OeuvreService } from 'src/app/service/oeuvre.service';

@Component({
  selector: 'app-resultat-recherche',
  templateUrl: './resultat-recherche.component.html',
  styleUrls: ['./resultat-recherche.component.css']
})
export class ResultatRechercheComponent implements OnInit {

  searchWord!: string;
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

  constructor(private oeuvreService:OeuvreService, private activatedRoute:ActivatedRoute, private router: Router) { 
    this.searchWord = activatedRoute.snapshot.params['searchWord'];
  }

  ngOnInit(): void {
    this.listeOeuvre$ = this.oeuvreService.getByKeyword(this.searchWord);
  }

  ngOnDiplay(l:Oeuvre)
  {
    if (l.type == "movie") {
    this.router.navigateByUrl("/film/" + l.id)
    }else if (l.type == "tvSeries" || l.type == "tvMiniSeries") {
    this.router.navigateByUrl("/serie/" + l.id)
    } else {
    this.router.navigateByUrl("/erreur404")
    }
  }
}
