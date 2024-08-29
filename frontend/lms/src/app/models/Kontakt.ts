import { Base } from "./Base";
import { TipKontakta } from "./TipKontakta";

export interface Kontakt extends Base {
    vrednost?: string;
    tipKontakta?: TipKontakta;
}