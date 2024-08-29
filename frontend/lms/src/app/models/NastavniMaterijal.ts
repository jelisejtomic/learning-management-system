import { Base } from "./Base";
import { Fajl } from "./Fajl";

export interface NastavniMaterijal extends Base {
    naziv?: string;
    godinaIzdavanja?: number;
    autori?: string[];
    fajlovi?: Fajl[];

}
