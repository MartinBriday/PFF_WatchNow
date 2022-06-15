import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, ExtraOptions, RouterModule } from '@angular/router';
import { Observable } from 'rxjs';
import { Film } from 'src/app/model/film.model';
import { FilmService } from 'src/app/service/film.service';

@Component({
  selector: 'app-synopsis',
  templateUrl: './synopsis.component.html',
  styleUrls: ['./synopsis.component.css']
})
export class SynopsisComponent implements OnInit {
  film$!: Observable<Film>
  id!:string
  constructor(private filmService: FilmService, private router: Router, private activatedRoute: ActivatedRoute) {
    this.id = activatedRoute.snapshot.params['id']
    console.log(activatedRoute.snapshot.params['id'])
   }

  ngOnInit(): void {
    // console.log(this.id)
    this.film$ = this.filmService.getOeuvreByIdFilm(this.id);
    this.film$.subscribe(data => console.log(data)) //
  }
}
