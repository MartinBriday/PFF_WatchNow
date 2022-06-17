import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { OwlOptions } from 'ngx-owl-carousel-o';
import { Observable } from 'rxjs';
import { OeuvreWatch } from 'src/app/model/oeuvre-watch.model';
import { Serie } from 'src/app/model/serie.model';
import { Synopsis } from 'src/app/model/synopsis.model';
import { Trailer } from 'src/app/model/trailer.model';
import { OeuvreWatchService } from 'src/app/service/oeuvre-watch.service';
import { SerieService } from 'src/app/service/serie.service';
import { SynopsisService } from 'src/app/service/synopsis.service';
import { TrailerService } from 'src/app/service/trailer.service';

@Component({
  selector: 'app-serie',
  templateUrl: './serie.component.html',
  styleUrls: ['./serie.component.css']
})
export class SerieComponent implements OnInit {
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

  serie$!: Observable<Serie>
  id!:string
  synopsis$!: Observable<Synopsis>
  trailer$!: Observable<Trailer>
  oeuvreWatch$!: Observable<OeuvreWatch>


constructor(private serieService: SerieService, private synopsisService: SynopsisService, private trailerService: TrailerService, private oeuvreWatchService: OeuvreWatchService,private router: Router, private activatedRoute: ActivatedRoute) {
    this.id = activatedRoute.snapshot.params['id']
   }



  ngOnInit(): void {
    // console.log(this.id)
    this.serie$ = this.serieService.getOeuvreByIdSerie(this.id);
    this.synopsis$ = this.synopsisService.getSynopsisByOeuvreId(this.id);
    this.trailer$ = this.trailerService.getTrailerByOeuvreId(this.id);
    this.oeuvreWatch$ = this.oeuvreWatchService.getOeuvreWatchByOeuvreId(this.id);

    this.serie$.subscribe(data => console.log(data))
     //
  }

}
