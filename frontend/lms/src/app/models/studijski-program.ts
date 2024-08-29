import { Base } from "./base";
import { Fakultet } from "./fakultet";
import { GodinaStudija } from "./godina-studija";
import { Nastavnik } from "./nastavnik";

export interface StudijskiProgram extends Base {
    akronim?: string;
    naziv?: string;
    opis?: string;
    fakultet?: Fakultet;
    godineStudija?: GodinaStudija[];
    rukovodilac?: Nastavnik;
}