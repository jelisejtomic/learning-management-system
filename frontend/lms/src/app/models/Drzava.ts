import { Base } from "./Base";
import { Mesto } from "./Mesto";

export interface Drzava extends Base {
    naziv?: string;
    mesta?: Mesto[];
}