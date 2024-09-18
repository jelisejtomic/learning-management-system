import { Base } from "./base";
import { NastavniMaterijal } from "./nastavni-materijal";
import { ObrazovniCilj } from "./obrazovni-cilj";

export interface Ishod extends Base {
    opis?: string;
    obrazovniCiljevi?: ObrazovniCilj[];
    nastavniMaterijal?: NastavniMaterijal[];
}
