import { Base } from "./base";
import { Zvanje } from "./zvanje";

export interface Nastavnik extends Base {
    jmbg?: string;
    biografija?: string;
    zvanja?: Zvanje[];
}