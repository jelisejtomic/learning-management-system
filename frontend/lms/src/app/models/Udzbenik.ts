import { Base } from "./Base";

export interface Udzbenik extends Base {
    autori?: string[];
    godinaIzdavanja?: number;
    naziv?: string;
    isbn?: string;
    stanje?: number;
}