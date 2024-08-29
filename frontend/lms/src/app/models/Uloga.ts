import { Base } from "./Base";

export interface Uloga extends Base {
    naziv?: string;
    datumDodeljivanja?: Date;
}