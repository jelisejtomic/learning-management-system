import { Base } from "./base";
import { Fajl } from "./fajl";
import { Nastavnik } from "./nastavnik";

export interface ZavrsniRad extends Base {
    naziv?: string;
    fajlovi?: Fajl[];
    mentor?: Nastavnik;
}