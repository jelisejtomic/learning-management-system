import { Base } from "./Base";
import { NaucnaOblast } from "./NaucnaOblast";
import { TipZvanja } from "./TipZvanja";

export interface Zvanje extends Base {
    datumIzbora?: Date;
    datumPrestanka?: Date;
    naucnaOblast?: NaucnaOblast;
    tipZvanja?: TipZvanja;
}