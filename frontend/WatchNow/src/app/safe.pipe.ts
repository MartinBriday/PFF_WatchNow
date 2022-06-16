import { Pipe, PipeTransform } from '@angular/core';
import { DomSanitizer } from "@angular/platform-browser";

@Pipe({
  name: 'safe'
})
export class SafePipe implements PipeTransform {

  constructor(private sanitizer: DomSanitizer) { }

  transform(trailerUrl: string) {
    console.log(trailerUrl);
    return this.sanitizer.bypassSecurityTrustResourceUrl(trailerUrl);


  }

}
