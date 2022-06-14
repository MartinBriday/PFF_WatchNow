import { Synopsis } from './synopsis.model';
import { Trailer } from './trailer.model';
export class Oeuvre {
  id!:string
  genres!:string
  releaseDate!:Date
  title!:OeuvreTitle
  ratings!:OeuvreRatings
  plotSummary!:OeuvrePlotSummary
  synopsis!:Synopsis
  trailer!:Trailer
}
