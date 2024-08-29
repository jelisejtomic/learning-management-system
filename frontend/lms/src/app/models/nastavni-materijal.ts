import { Base } from "./base";
import { Fajl } from "./fajl";

export interface NastavniMaterijal extends Base {
    naziv?: string;
    godinaIzdavanja?: number;
    autori?: string[];
    fajlovi?: Fajl[];

}
