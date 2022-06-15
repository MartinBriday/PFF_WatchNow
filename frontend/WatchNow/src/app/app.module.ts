import { CarouselModule } from 'ngx-owl-carousel-o';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BarPourcentageComponent } from './composant/bar-pourcentage/bar-pourcentage.component';
import { BoutonVuOuNonComponent } from './composant/bouton-vu-ou-non/bouton-vu-ou-non.component';
import { CommentaireComponent } from './composant/commentaire/commentaire.component';
import { EpisodeComponent } from './composant/episode/episode.component';
import { ListeAleatoireFilmComponent } from './composant/liste-aleatoire-film/liste-aleatoire-film.component';
import { ListeAleatoireSerieComponent } from './composant/liste-aleatoire-serie/liste-aleatoire-serie.component';
import { ListeDejaVuComponent } from './composant/liste-deja-vu/liste-deja-vu.component';
import { ListeFavorisComponent } from './composant/liste-favoris/liste-favoris.component';
import { ListeNouveauteComponent } from './composant/liste-nouveaute/liste-nouveaute.component';
import { NavBarComponent } from './composant/nav-bar/nav-bar.component';
import { SaisonComponent } from './composant/saison/saison.component';
import { AccueilComponent } from './page/accueil/accueil.component';
import { CategorieFilmComponent } from './page/categorie-film/categorie-film.component';
import { CategorieSerieComponent } from './page/categorie-serie/categorie-serie.component';
import { Erreur404Component } from './page/erreur404/erreur404.component';
import { FilmComponent } from './page/film/film.component';
import { FormInscriptionComponent } from './page/form-inscription/form-inscription.component';
import { MonCompteComponent } from './page/mon-compte/mon-compte.component';
import { RechercheAvanceeComponent } from './page/recherche-avancee/recherche-avancee.component';
import { SerieComponent } from './page/serie/serie.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { ListMostPopularFilmComponent } from './composant/list-most-popular-film/list-most-popular-film.component';
import { HttpClientModule } from '@angular/common/http';
import { ListMostPopularSerieComponent } from './composant/list-most-popular-serie/list-most-popular-serie.component';
import { SynopsisComponent } from './composant/synopsis/synopsis.component';
import { ListeComingSoonFilmComponent } from './composant/liste-coming-soon-film/liste-coming-soon-film.component';
import { FooterComponent } from './composant/footer/footer.component';
import { ListeComingSoonSerieComponent } from './composant/liste-coming-soon-serie/liste-coming-soon-serie.component';
@NgModule({
  declarations: [
    AppComponent,
    AccueilComponent,
    BarPourcentageComponent,
    BoutonVuOuNonComponent,
    CommentaireComponent,
    EpisodeComponent,
    ListeAleatoireFilmComponent,
    ListeAleatoireSerieComponent,
    ListeFavorisComponent,
    ListeDejaVuComponent,
    ListeNouveauteComponent,
    NavBarComponent,
    SaisonComponent,
    CategorieFilmComponent,
    CategorieSerieComponent,
    Erreur404Component,
    FilmComponent,
    FormInscriptionComponent,
    MonCompteComponent,
    RechercheAvanceeComponent,
    SerieComponent,
    ListMostPopularFilmComponent,
    ListMostPopularSerieComponent,
    SynopsisComponent,
    ListeComingSoonFilmComponent,
    FooterComponent,
    ListeComingSoonSerieComponent
  ],

  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    CarouselModule,
    BrowserAnimationsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
