import { Personne } from './personne.model';
import { UtilisateurLogin } from './utilisateur-login.model';
import { Avis } from './avis.model';
export class Utilisateur extends Personne {
  _email!:string
  _listeAvis!:Avis[]
  _utilisateurLogin!: UtilisateurLogin
}
