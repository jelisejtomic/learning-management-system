import { Base } from "./Base";
import { Zvanje } from "./Zvanje";

export interface Nastavnik extends Base {
    jmbg?: string;
    biografija?: string;
    zvanja?: Zvanje[];
}