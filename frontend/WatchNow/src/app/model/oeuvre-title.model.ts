import { OeuvreImage } from "./oeuvre-image.model";

export class OeuvreTitle {
    id!:string;
	title!:string;
	titleType!:string;
    runningTimeInMinutes!:number;
	image!:OeuvreImage;
	numberOfEpisodes!:number;;
	seriesStartYear!:number;;
	seriesEndYear!:number;;
	episode!:number;;
	season!:number;;
	nextEpisode!:string;
	previousEpisode!:string;
	parentTitle!:OeuvreTitle;
}
