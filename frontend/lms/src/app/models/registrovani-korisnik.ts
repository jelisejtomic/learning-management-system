import { Base } from "./base";
import { Uloga } from "./uloga";

export interface RegistrovaniKorisnik extends Base {
    koriscnikoIme?: string;
    lozinka?: string;
    email?: string;
    ime?: string;
    prezime?: string;
    uloge?: Uloga[];
}