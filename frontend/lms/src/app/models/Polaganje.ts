import { Base } from "./Base";
import { EvaluacijaZnanja } from "./EvaluacijaZnanja";
import { StudentNaGodini } from "./StudentNaGodini";

export interface Polaganje extends Base {
    bodovi?: number;
    napomena?: string;
    ispit?: boolean;
    prestupi?: string[];
    studentNaGodini?: StudentNaGodini;
    evaluacijaZnanja?: EvaluacijaZnanja;
}
