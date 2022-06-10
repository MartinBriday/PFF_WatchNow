import { UtilisateurLogin } from './utilisateur-login.model';
import { Avis } from './avis.model';
export class Utilisateur {
  _email!:string
  _listeAvis!:Avis[]
  _utilisateurLogin!:UtilisateurLogin
}
