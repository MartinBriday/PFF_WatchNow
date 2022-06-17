import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Utilisateur } from 'src/app/model/utilisateur.model';
import { OeuvreService } from 'src/app/service/oeuvre.service';
import { UtilisateurService } from 'src/app/service/utilisateur.service';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css']
})
export class NavBarComponent implements OnInit {

  searchWord!: string
  utilisateur$!: Observable<Utilisateur>


  constructor(private oeuvreService:OeuvreService, private router:Router, private utilisateurService: UtilisateurService) { }

  ngOnInit(): void {
    this.utilisateur$ = this.utilisateurService.getByLogin(sessionStorage.getItem('username'))
  }

  searchThis() {
    this.router.navigateByUrl("/recherche/" + this.searchWord);
  }

}
