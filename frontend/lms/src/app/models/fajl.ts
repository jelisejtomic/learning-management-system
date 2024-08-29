import { Base } from "./base";

export interface Fajl extends Base {
    opis?: string;
    url?: string;
    tip?: string;
    vremeKreiranja?: Date;
}
