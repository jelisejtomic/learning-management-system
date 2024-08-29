import { Base } from "./base";
import { RealizacijaPredmeta } from "./realizacija-predmeta";
import { Student } from "./student";

export interface PohadjanjePredmeta extends Base {
    konacnaOcena?: number;
    bodovi?: number;
    bonusBodovi?: number;
    student?: Student;
    realizacijaPredmeta?: RealizacijaPredmeta;
}
