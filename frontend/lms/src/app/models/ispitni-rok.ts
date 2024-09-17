import { Base } from "./base";

export interface IspitniRok extends Base {
    naziv?: string;
    pocetakRoka: Date;
    krajRoka: Date;
}