import { Base } from "./base";

export interface Inventar extends Base {
    naziv?: string;
    opis?: string;
    stanje?: number;
}
