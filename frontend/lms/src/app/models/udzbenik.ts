import { Base } from "./base";

export interface Udzbenik extends Base {
    autori?: string[];
    godinaIzdavanja?: number;
    naziv?: string;
    isbn?: string;
    stanje?: number;
}