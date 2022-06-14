import { OeuvreImage } from './oeuvre-image.model';
import { OeuvrePlotSummary } from './oeuvre-plot-summary.model';
import { OeuvreRating } from './oeuvre-rating.model';
import { Synopsis } from './synopsis.model';
import { Trailer } from './trailer.model';
export class Oeuvre {
  id!:string
  genres!:string[]
  releaseDate!:Date
  titre!:string
  ratings!:OeuvreRating
  plotSummary!:OeuvrePlotSummary
  synopsis!:Synopsis
  trailer!:Trailer
  dureeInMinutes!: number
  image!: OeuvreImage
  type!: string
}
