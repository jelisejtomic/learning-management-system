import { Adresa } from "./adresa";
import { Base } from "./base";
import { Kontakt } from "./kontakt";
import { Nastavnik } from "./nastavnik";
import { StudijskiProgram } from "./studijski-program";
import { Univerzitet } from "./univerzitet";

export interface Fakultet extends Base {
    naziv?: string;
    dekan?: Nastavnik;
    adresa?: Adresa;
    kontakti?: Kontakt[];
    studijskiProgrami?: StudijskiProgram[];
    univerzitet?: Univerzitet;
}