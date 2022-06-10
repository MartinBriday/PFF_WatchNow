import { Nationalite } from './nationalite.model';
export class Personne {
  _idPersonne!:number
  _nom!:string
  _prenom!:string
  _dateNaissance!:Date
  _listeNationalite!:Nationalite[]
}
