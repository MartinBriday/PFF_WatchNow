import { MonCompteComponent } from './page/mon-compte/mon-compte.component';
import { CategorieFilmComponent } from './page/categorie-film/categorie-film.component';
import { NgModule } from '@angular/core';
import { ExtraOptions, RouterModule, Routes } from '@angular/router';
import { ListeAleatoireFilmComponent } from './composant/liste-aleatoire-film/liste-aleatoire-film.component';
import { SynopsisComponent } from './composant/synopsis/synopsis.component';
import { AccueilComponent } from './page/accueil/accueil.component';
import { Erreur404Component } from './page/erreur404/erreur404.component';
import { FilmComponent } from './page/film/film.component';
import { ResultatRechercheComponent } from './page/resultat-recherche/resultat-recherche.component';

const routes: Routes = [
  {path:"accueil", component: AccueilComponent},
  {path:"categorie-film", component: CategorieFilmComponent},
  {path:"recherche/:searchWord", component: ResultatRechercheComponent},
  {path:"film/:id", component: FilmComponent, children:[{path: "synopsis/:id", component: SynopsisComponent}]},
  {path:"mon_compte", component: MonCompteComponent},
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
