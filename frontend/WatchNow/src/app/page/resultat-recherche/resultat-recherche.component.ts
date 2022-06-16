import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
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

  constructor(private oeuvreService:OeuvreService, private activatedRoute:ActivatedRoute) { 
    this.searchWord = activatedRoute.snapshot.params['searchWord'];
  }

  ngOnInit(): void {
    this.listeOeuvre$ = this.oeuvreService.getByKeyword(this.searchWord);
  }

}
