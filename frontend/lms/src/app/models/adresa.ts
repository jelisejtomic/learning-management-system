import { Base } from "./base";
import { Mesto } from "./mesto";

export interface Adresa extends Base {
    ulica?: string;
    broj?: string;
    mesto?: Mesto;
}
