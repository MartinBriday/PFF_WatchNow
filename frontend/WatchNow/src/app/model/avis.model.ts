import { Utilisateur } from './utilisateur.model';
export class Avis {
  _id!:number
  _note!:number
  _commentaire!:string
  _utilisateur!:Utilisateur
}
