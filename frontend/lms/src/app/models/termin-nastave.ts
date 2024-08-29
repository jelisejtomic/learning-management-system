import { Base } from "./base";
import { Ishod } from "./ishod";
import { RealizacijaPredmeta } from "./realizacija-predmeta";
import { TipNastave } from "./tip-nastave";

export interface TerminNastave extends Base {
    vremePocetka?: Date;
    vremeKraja?: Date;
    mestoOdrzavanja?: string;
    ishod?: Ishod;
    realizacijaPredmeta?: RealizacijaPredmeta;
    tipNastave?: TipNastave;
}