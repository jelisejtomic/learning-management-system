import { Base } from "./base";
import { Fajl } from "./fajl";
import { TipDokumenta } from "./tip-dokumenta";

export interface Dokument extends Base {
    naziv?: string;
    opis?: string;
    datumIzdavanja?: Date;
    fajlovi?: Fajl[];
    tipDokumenta?: TipDokumenta;
}