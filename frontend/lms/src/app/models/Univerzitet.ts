import { Base } from "./Base";
import { Adresa } from "./Adresa";
import { Fakultet } from "./Fakultet";
import { Kontakt } from "./Kontakt";
import { Nastavnik } from "./Nastavnik";

export interface Univerzitet extends Base {
    naziv?: string;
    datumOsnivanja?: Date;
    opis?: string;
    fakulteti?: Fakultet[];
    kontakti?: Kontakt[];
    adrese?: Adresa[];
    rektor?: Nastavnik;
}