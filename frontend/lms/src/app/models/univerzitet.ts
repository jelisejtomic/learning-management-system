import { Base } from "./base";
import { Adresa } from "./adresa";
import { Fakultet } from "./fakultet";
import { Kontakt } from "./kontakt";
import { Nastavnik } from "./nastavnik";

export interface Univerzitet extends Base {
    naziv?: string;
    datumOsnivanja?: Date;
    opis?: string;
    fakulteti?: Fakultet[];
    kontakti?: Kontakt[];
    adrese?: Adresa[];
    rektor?: Nastavnik;
}