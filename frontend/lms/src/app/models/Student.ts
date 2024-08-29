import { Adresa } from "./Adresa";
import { Base } from "./Base";
import { PohadjanjePredmeta } from "./PohadjanjePredmeta";
import { StudentNaGodini } from "./StudentNaGodini";

export interface Student extends Base {
    jmbg?: string;
    datumRodjenja?: Date;
    adresa?: Adresa;
    studentNaGodinama?: StudentNaGodini[];
    pohadjanjaPredmeta?: PohadjanjePredmeta[];
}