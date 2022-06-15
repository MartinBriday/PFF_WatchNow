import { OeuvreWatchLink } from "../model/oeuvre-watch-link.model"
import { OeuvreWatchProvider } from "../model/oeuvre-watch-provider.model"

export class OeuvreWatchOption {
  primaryText!:string
  secondaryText!:string
  link!:OeuvreWatchLink
  provider!:OeuvreWatchProvider
}
