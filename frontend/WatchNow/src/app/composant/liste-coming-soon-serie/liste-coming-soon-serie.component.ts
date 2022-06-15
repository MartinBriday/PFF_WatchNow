import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { OwlOptions } from 'ngx-owl-carousel-o';
import { Observable } from 'rxjs';
import { Serie } from 'src/app/model/serie.model';
import { SerieService } from 'src/app/service/serie.service';

@Component({
  selector: 'app-liste-coming-soon-serie',
  templateUrl: './liste-coming-soon-serie.component.html',
  styleUrls: ['./liste-coming-soon-serie.component.css']
})
export class ListeComingSoonSerieComponent implements OnInit {
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

  listeComingSoonSerie$!: Observable<Serie[]>

  ngOnInit(): void {
    this.listeComingSoonSerie$ = this.serieService.getComingSoonSerie();
  }

  ngOnDiplay(id:string)
  {
    this.router.navigateByUrl("/serie/" + id)
  }

}
