import { Oeuvre } from "./oeuvre.model"

export class Episode extends Oeuvre{

  numero!:number
  numeroSaison!:number
  serieId!:string
  nextEpisodeId!:string
  previousEpisodeId!:string

  constructor(){
    super()
  }

}
