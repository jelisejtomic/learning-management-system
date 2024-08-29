import { Base } from "./Base";
import { Fajl } from "./Fajl";
import { TipDokumenta } from "./TipDokumenta";

export interface Dokument extends Base {
    naziv?: string;
    opis?: string;
    datumIzdavanja?: Date;
    fajlovi?: Fajl[];
    tipDokumenta?: TipDokumenta;
}