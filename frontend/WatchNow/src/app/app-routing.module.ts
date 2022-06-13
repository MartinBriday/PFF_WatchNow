import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListeAleatoireFilmComponent } from './composant/liste-aleatoire-film/liste-aleatoire-film.component';
import { AccueilComponent } from './page/accueil/accueil.component';

const routes: Routes = [
  {path:"accueil", component: AccueilComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
