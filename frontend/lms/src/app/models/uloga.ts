import { Base } from "./base";

export interface Uloga extends Base {
    naziv?: string;
    datumDodeljivanja?: Date;
}