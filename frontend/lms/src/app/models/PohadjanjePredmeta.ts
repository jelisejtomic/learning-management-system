import { Base } from "./Base";
import { RealizacijaPredmeta } from "./RealizacijaPredmeta";
import { Student } from "./Student";

export interface PohadjanjePredmeta extends Base {
    konacnaOcena?: number;
    bodovi?: number;
    bonusBodovi?: number;
    student?: Student;
    realizacijaPredmeta?: RealizacijaPredmeta;
}
