import { Base } from "./Base";
import { Uloga } from "./Uloga";

export interface RegistrovaniKorisnik extends Base {
    koriscnikoIme?: string;
    lozinka?: string;
    email?: string;
    ime?: string;
    prezime?: string;
    uloge?: Uloga[];
}