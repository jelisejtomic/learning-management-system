import { Base } from "./base";
import { NaucnaOblast } from "./naucna-oblast";
import { TipZvanja } from "./tip-zvanja";

export interface Zvanje extends Base {
    datumIzbora?: Date;
    datumPrestanka?: Date;
    naucnaOblast?: NaucnaOblast;
    tipZvanja?: TipZvanja;
}