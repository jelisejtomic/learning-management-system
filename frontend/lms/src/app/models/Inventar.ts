import { Base } from "./Base";

export interface Inventar extends Base {
    naziv?: string;
    opis?: string;
    stanje?: number;
}
