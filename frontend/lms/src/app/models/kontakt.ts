import { Base } from "./base";
import { TipKontakta } from "./tip-kontakta";

export interface Kontakt extends Base {
    vrednost?: string;
    tipKontakta?: TipKontakta;
}