import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Episode } from 'src/app/model/episode.model';
import { OeuvreWatch } from 'src/app/model/oeuvre-watch.model';
import { Synopsis } from 'src/app/model/synopsis.model';
import { Trailer } from 'src/app/model/trailer.model';
import { EpisodeService } from 'src/app/service/episode.service';
import { OeuvreWatchService } from 'src/app/service/oeuvre-watch.service';
import { SynopsisService } from 'src/app/service/synopsis.service';
import { TrailerService } from 'src/app/service/trailer.service';

@Component({
  selector: 'app-episode',
  templateUrl: './episode.component.html',
  styleUrls: ['./episode.component.css']
})
export class EpisodeComponent implements OnInit {

  episode$!: Observable<Episode>
  id!:string
  synopsis$!: Observable<Synopsis>
  trailer$!: Observable<Trailer>
  oeuvreWatch$!: Observable<OeuvreWatch>


  constructor(private episodeService: EpisodeService, private synopsisService: SynopsisService, private trailerService: TrailerService, private oeuvreWatchService: OeuvreWatchService,private router: Router, private activatedRoute: ActivatedRoute) {
    this.id = activatedRoute.snapshot.params['id']
   }

   ngOnInit(): void {
    // console.log(this.id)
    this.episode$ = this.episodeService.getEpisodeById(this.id);
    this.synopsis$ = this.synopsisService.getSynopsisByOeuvreId(this.id);
    this.trailer$ = this.trailerService.getTrailerByOeuvreId(this.id);
    this.oeuvreWatch$ = this.oeuvreWatchService.getOeuvreWatchByOeuvreId(this.id);

    this.episode$.subscribe(data => console.log(data))
     //
  }

    ngOnSwitchEpisode(id:string)
    {
      this.episode$ = this.episodeService.getEpisodeById(id);
    this.synopsis$ = this.synopsisService.getSynopsisByOeuvreId(id);
    this.trailer$ = this.trailerService.getTrailerByOeuvreId(id);
    this.oeuvreWatch$ = this.oeuvreWatchService.getOeuvreWatchByOeuvreId(id);
      this.router.navigateByUrl('/serie/episode/' + id)

    }



}
