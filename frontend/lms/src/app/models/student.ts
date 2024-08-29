import { Adresa } from "./adresa";
import { Base } from "./base";
import { PohadjanjePredmeta } from "./pohadjanje-predmeta";
import { StudentNaGodini } from "./student-na-godini";

export interface Student extends Base {
    jmbg?: string;
    datumRodjenja?: Date;
    adresa?: Adresa;
    studentNaGodinama?: StudentNaGodini[];
    pohadjanjaPredmeta?: PohadjanjePredmeta[];
}