import { Base } from "./base";
import { Uloga } from "./uloga";

export interface RegistrovaniKorisnik extends Base {
    korisnickoIme?: string;
    email?: string;
    ime?: string;
    prezime?: string;
    uloge?: Uloga[];
}