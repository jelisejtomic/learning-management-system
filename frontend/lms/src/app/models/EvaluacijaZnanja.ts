import { Base } from "./Base";
import { InstrumentEvaluacije } from "./InstrumentEvaluacije";
import { Ishod } from "./Ishod";
import { Polaganje } from "./Polaganje";
import { TipEvaluacije } from "./TipEvaluacije";

export interface EvaluacijaZnanja extends Base {
    vremePocetka?: Date;
    vremeKraja?: Date;
    mestoOdrzavanja?: string;
    minBodovi?: number;
    maxBodovi?: number;
    tipEvaluacije?: TipEvaluacije;
    polaganja?: Polaganje[];
    ishod?: Ishod;
    instrumentEvaluacije?: InstrumentEvaluacije;
}