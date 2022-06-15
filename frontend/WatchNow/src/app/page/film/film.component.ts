import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { OwlOptions } from 'ngx-owl-carousel-o';
import { Observable } from 'rxjs';
import { Film } from 'src/app/model/film.model';
import { OeuvreWatch } from 'src/app/model/oeuvre-watch.model';
import { Synopsis } from 'src/app/model/synopsis.model';
import { Trailer } from 'src/app/model/trailer.model';
import { FilmService } from 'src/app/service/film.service';
import { OeuvreWatchService } from 'src/app/service/oeuvre-watch.service';
import { SynopsisService } from 'src/app/service/synopsis.service';
import { TrailerService } from 'src/app/service/trailer.service';

@Component({
  selector: 'app-film',
  templateUrl: './film.component.html',
  styleUrls: ['./film.component.css']
})
export class FilmComponent implements OnInit {

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

  film$!: Observable<Film>
  id!:string
  synopsis$!: Observable<Synopsis>
  trailer$!: Observable<Trailer>
  oeuvreWatch$!: Observable<OeuvreWatch>


  constructor(private filmService: FilmService, private synopsisService: SynopsisService, private trailerService: TrailerService, private oeuvreWatchService: OeuvreWatchService,private router: Router, private activatedRoute: ActivatedRoute) {
    this.id = activatedRoute.snapshot.params['id']
   }



  ngOnInit(): void {
    // console.log(this.id)
    this.film$ = this.filmService.getOeuvreByIdFilm(this.id);
    this.synopsis$ = this.synopsisService.getSynopsisByOeuvreId(this.id);
    this.trailer$ = this.trailerService.getTrailerByOeuvreId(this.id);
    this.oeuvreWatch$ = this.oeuvreWatchService.getOeuvreWatchByOeuvreId(this.id);

    this.film$.subscribe(data => console.log(data))
     //
  }


}
