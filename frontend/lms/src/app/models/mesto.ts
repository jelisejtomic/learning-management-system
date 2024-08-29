import { Base } from "./base";
import { Drzava } from "./drzava";

export interface Mesto extends Base {
    naziv?: string;
    drzava?: Drzava;
}