import { Base } from "./Base";
import { Fakultet } from "./Fakultet";
import { GodinaStudija } from "./GodinaStudija";
import { Nastavnik } from "./Nastavnik";

export interface StudijskiProgram extends Base {
    akronim?: string;
    naziv?: string;
    opis?: string;
    fakultet?: Fakultet;
    godineStudija?: GodinaStudija[];
    rukovodilac?: Nastavnik;
}