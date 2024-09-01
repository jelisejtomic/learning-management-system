import { Base } from "./base";
import { EvaluacijaZnanja } from "./evaluacija-znanja";
import { IspitniRok } from "./ispitni-rok";
import { RealizacijaPredmeta } from "./realizacija-predmeta";
import { StudentNaGodini } from "./student-na-godini";

export interface PrijavaIspita extends Base {
    realizacijaPredmeta?: RealizacijaPredmeta;
    evaluacijaZnanja?: EvaluacijaZnanja;
    ispitniRok?: IspitniRok;
    studentNaGodini?: StudentNaGodini;
    vremePrijave?: Date;
}