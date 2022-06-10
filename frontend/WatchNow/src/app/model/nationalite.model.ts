import { Personne } from './personne.model';
import { Langue } from './langue.model';
export class Nationalite {
  _id!:string
  _nom!:string
  _listePersonne!:Personne[]
  _listeLangue!:Langue[]
}
