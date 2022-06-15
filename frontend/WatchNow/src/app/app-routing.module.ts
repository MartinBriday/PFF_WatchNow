import { NgModule } from '@angular/core';
import { ExtraOptions, RouterModule, Routes } from '@angular/router';
import { ListeAleatoireFilmComponent } from './composant/liste-aleatoire-film/liste-aleatoire-film.component';
import { SynopsisComponent } from './composant/synopsis/synopsis.component';
import { AccueilComponent } from './page/accueil/accueil.component';
import { Erreur404Component } from './page/erreur404/erreur404.component';
import { FilmComponent } from './page/film/film.component';

const routes: Routes = [
  {path:"accueil", component: AccueilComponent},
  {path:"film/:id", component: FilmComponent, children:[{path: "synopsis", component: SynopsisComponent}]},

  {path : "**", component: Erreur404Component}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

export const routingConfiguration: ExtraOptions = {
  paramsInheritanceStrategy: 'always'
};

export const Routing = RouterModule.forRoot(routes, routingConfiguration);
