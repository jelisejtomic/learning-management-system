import { Base } from "./base";
import { InstrumentEvaluacije } from "./instrument-evaluacije";
import { Ishod } from "./ishod";
import { Polaganje } from "./polaganje";
import { TipEvaluacije } from "./tip-evaluacije";

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