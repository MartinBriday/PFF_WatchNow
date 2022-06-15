import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, ExtraOptions, RouterModule } from '@angular/router';
import { Observable } from 'rxjs';
import { Film } from 'src/app/model/film.model';
import { Synopsis } from 'src/app/model/synopsis.model';
import { Trailer } from 'src/app/model/trailer.model';
import { FilmService } from 'src/app/service/film.service';
import { OeuvreWatchService } from 'src/app/service/oeuvre-watch.service';
import { SynopsisService } from 'src/app/service/synopsis.service';
import { TrailerService } from 'src/app/service/trailer.service';

@Component({
  selector: 'app-synopsis',
  templateUrl: './synopsis.component.html',
  styleUrls: ['./synopsis.component.css']
})
export class SynopsisComponent implements OnInit {
  film$!: Observable<Film>
  id!:string
  synopsis$!: Observable<Synopsis>
  trailer$!: Observable<Trailer>
  constructor(private filmService: FilmService  ,private synopsisService: SynopsisService, private trailerService: TrailerService, private oeuvreWatchService: OeuvreWatchService, private router: Router, private activatedRoute: ActivatedRoute) {
    this.id = activatedRoute.snapshot.params['id']
    console.log(activatedRoute.snapshot.params['id'])
   }


  ngOnInit(): void {
    // console.log(this.id)
    this.film$ = this.filmService.getOeuvreByIdFilm(this.id);
    this.synopsis$ = this.synopsisService.getSynopsisByOeuvreId(this.id);
    this.trailer$ = this.trailerService.getTrailerByOeuvreId(this.id);

    this.film$.subscribe(data => console.log(data)) //
  }
}
