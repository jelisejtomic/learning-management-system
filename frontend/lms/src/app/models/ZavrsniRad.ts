import { Base } from "./Base";
import { Fajl } from "./Fajl";
import { Nastavnik } from "./Nastavnik";

export interface ZavrsniRad extends Base {
    naziv?: string;
    fajlovi?: Fajl[];
    mentor?: Nastavnik;
}