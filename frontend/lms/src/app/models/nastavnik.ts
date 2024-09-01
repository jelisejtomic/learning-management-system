import { Base } from "./base";
import { RegistrovaniKorisnik } from "./registrovani-korisnik";
import { Zvanje } from "./zvanje";

export interface Nastavnik extends Base {
    korisnik?: RegistrovaniKorisnik;
    jmbg?: string;
    biografija?: string;
    zvanja?: Zvanje[];
}