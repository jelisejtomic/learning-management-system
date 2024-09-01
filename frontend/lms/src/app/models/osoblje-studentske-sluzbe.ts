import { Base } from "./base";
import { Inventar } from "./inventar";
import { RegistrovaniKorisnik } from "./registrovani-korisnik";
import { Udzbenik } from "./udzbenik";

export interface OsobljeStudentskeSluzbe extends Base {
    korisnik?: RegistrovaniKorisnik;
    biografija?: string;
    inventar?: Inventar[];
    biblioteka?: Udzbenik[];
}