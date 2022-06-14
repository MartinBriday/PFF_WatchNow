import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListeAleatoireFilmComponent } from './composant/liste-aleatoire-film/liste-aleatoire-film.component';
import { AccueilComponent } from './page/accueil/accueil.component';
import { Erreur404Component } from './page/erreur404/erreur404.component';

const routes: Routes = [
  {path:"accueil", component: AccueilComponent},
  {path : "**", component: Erreur404Component}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
