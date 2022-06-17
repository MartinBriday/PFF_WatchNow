import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { OeuvreService } from 'src/app/service/oeuvre.service';

@Component({
  selector: 'app-recherche-avancee',
  templateUrl: './recherche-avancee.component.html',
  styleUrls: ['./recherche-avancee.component.css']
})
export class RechercheAvanceeComponent implements OnInit {

  searchWord!: string


  constructor(private oeuvreService:OeuvreService, private router:Router) { }

  ngOnInit(): void {
  }

  searchThis() {
    this.router.navigateByUrl("/recherche/" + this.searchWord);
  }

}
