import { Base } from "./base";
import { EvaluacijaZnanja } from "./evaluacija-znanja";
import { StudentNaGodini } from "./student-na-godini";

export interface Polaganje extends Base {
    bodovi?: number;
    napomena?: string;
    ispit?: boolean;
    prestupi?: string[];
    studentNaGodini?: StudentNaGodini;
    evaluacijaZnanja?: EvaluacijaZnanja;
}
