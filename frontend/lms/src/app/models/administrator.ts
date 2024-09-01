import { Base } from "./base";
import { RegistrovaniKorisnik } from "./registrovani-korisnik";

export interface Administrator extends Base {
    korisnik?: RegistrovaniKorisnik;
}