import { Component, OnInit } from '@angular/core';
import { OwlOptions } from 'ngx-owl-carousel-o';
@Component({
  selector: 'app-liste-aleatoire-film',
  templateUrl: './liste-aleatoire-film.component.html',
  styleUrls: ['./liste-aleatoire-film.component.css']
})
export class ListeAleatoireFilmComponent implements OnInit {

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

  constructor() { }

  ngOnInit(): void {

  }
   scrollAmount:number = 0;

  sliders = document.querySelector(".carouselbox");
  scrollPerClick!:number;
  ImagePadding = 20;

sliderScrollLeft() {
    this.sliders?.scrollTo({
      top: 0,
      left: (this.scrollAmount -= this.scrollPerClick),
      behavior: "smooth"
    });

    if(this.scrollAmount < 0) {
      this.scrollAmount = 0
    }
  }

 sliderScrollRight() {
    if(this.sliders!=null) {
      if(this.scrollAmount <= this.sliders.scrollWidth - this.sliders.clientWidth) {
        this.sliders?.scrollTo({
          top: 0,
          left: (this.scrollAmount += this.scrollPerClick),
          behavior: "smooth"
        })
      }
    }

  }

}
