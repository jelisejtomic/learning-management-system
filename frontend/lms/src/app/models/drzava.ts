import { Base } from "./base";
import { Mesto } from "./mesto";

export interface Drzava extends Base {
    naziv?: string;
    mesta?: Mesto[];
}