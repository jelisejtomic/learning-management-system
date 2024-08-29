import { Base } from "./Base";
import { Drzava } from "./Drzava";

export interface Mesto extends Base {
    naziv?: string;
    drzava?: Drzava;
}