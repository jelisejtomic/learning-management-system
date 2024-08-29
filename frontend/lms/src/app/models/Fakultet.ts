import { Adresa } from "./Adresa";
import { Base } from "./Base";
import { Kontakt } from "./Kontakt";
import { Nastavnik } from "./Nastavnik";
import { StudijskiProgram } from "./StudijskiProgram";
import { Univerzitet } from "./Univerzitet";

export interface Fakultet extends Base {
    naziv?: string;
    dekan?: Nastavnik;
    adresa?: Adresa; //!proveriti
    kontakti?: Kontakt[];
    studijskiProgrami?: StudijskiProgram[];
    univerzitet?: Univerzitet;
}