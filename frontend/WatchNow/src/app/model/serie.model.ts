import { Oeuvre } from "./oeuvre.model";
import { Saison } from "./saison.model";

export class Serie extends Oeuvre{
  nbEpisodes!:number
  anneeDebut!:number
  anneeFin!:number
  saisons!: Saison[]
	constructor() {
    super()
	}

}
