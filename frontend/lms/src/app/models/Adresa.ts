import { Base } from "./Base";
import { Mesto } from "./Mesto";

export interface Adresa extends Base {
    ulica?: string;
    broj?: string;
    mesto?: Mesto;
}
