import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { OwlOptions } from 'ngx-owl-carousel-o';
import { Observable } from 'rxjs';
import { Serie } from 'src/app/model/serie.model';
import { SerieService } from 'src/app/service/serie.service';

@Component({
  selector: 'app-list-most-popular-serie',
  templateUrl: './list-most-popular-serie.component.html',
  styleUrls: ['./list-most-popular-serie.component.css']
})
export class ListMostPopularSerieComponent implements OnInit {
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

  listMostPopularSerie$!: Observable<Serie[]>

  ngOnInit(): void {
    this.listMostPopularSerie$ = this.serieService.getMostPopularSerie();
  }
  ngOnDiplay(id:string)
  {

    this.router.navigateByUrl("/serie/" + id)
  }
}
