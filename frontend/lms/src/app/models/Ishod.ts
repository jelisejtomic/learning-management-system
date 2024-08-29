import { Base } from "./Base";
import { NastavniMaterijal } from "./NastavniMaterijal";
import { ObrazovniCilj } from "./ObrazovniCilj";

export interface Ishod extends Base {
    opis?: string;
    obrazovniCiljevi?: ObrazovniCilj[];
    nastavniMaterijali?: NastavniMaterijal[];
}
