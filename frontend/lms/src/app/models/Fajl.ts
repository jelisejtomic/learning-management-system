import { Base } from "./Base";

export interface Fajl extends Base {
    opis?: string;
    url?: string;
    tip?: string;
    vremeKreiranja?: Date;
}
