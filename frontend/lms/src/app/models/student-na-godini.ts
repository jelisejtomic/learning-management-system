import { Base } from "./base";
import { GodinaStudija } from "./godina-studija";
import { OdbranaZavrsnogRada } from "./odbrana-zavrsnog-rada";
import { Polaganje } from "./polaganje";
import { Student } from "./student";
import { ZavrsniRad } from "./zavrsni-rad";

export interface StudentNaGodini extends Base {
    datumUpisa?: Date;
    brojIndeksa?: string;
    godinaStudija?: GodinaStudija;
    polaganja?: Polaganje[];
    odbranaZavrsnogRada?: OdbranaZavrsnogRada;
    zavrsniRad?: ZavrsniRad;
    student?: Student;
}