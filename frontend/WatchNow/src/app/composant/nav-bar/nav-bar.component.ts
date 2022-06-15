import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { OeuvreService } from 'src/app/service/oeuvre.service';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css']
})
export class NavBarComponent implements OnInit {

  searchWord: string = ""


  constructor(private oeuvreService:OeuvreService, private router:Router, private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
  }

  searchThis() {
    this.router.navigateByUrl("/recherche/" + this.searchWord);
  }

}
