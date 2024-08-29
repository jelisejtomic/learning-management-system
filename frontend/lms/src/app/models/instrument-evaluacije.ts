import { Base } from "./base";
import { Fajl } from "./fajl";

export interface InstrumentEvaluacije extends Base {
    fajlovi: Fajl[];
}