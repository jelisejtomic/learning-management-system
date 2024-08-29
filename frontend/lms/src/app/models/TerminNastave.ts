import { Base } from "./Base";
import { Ishod } from "./Ishod";
import { RealizacijaPredmeta } from "./RealizacijaPredmeta";
import { TipNastave } from "./TipNastave";

export interface TerminNastave extends Base {
    vremePocetka?: Date;
    vremeKraja?: Date;
    mestoOdrzavanja?: string;
    ishod?: Ishod;
    realizacijaPredmeta?: RealizacijaPredmeta;
    tipNastave?: TipNastave;
}