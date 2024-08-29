import { Base } from "./Base";
import { GodinaStudija } from "./GodinaStudija";
import { OdbranaZavrsnogRada } from "./OdbranaZavrsnogRada";
import { Polaganje } from "./Polaganje";
import { Student } from "./Student";
import { ZavrsniRad } from "./ZavrsniRad";

export interface StudentNaGodini extends Base {
    datumUpisa?: Date;
    brojIndeksa?: string;
    godinaStudija?: GodinaStudija;
    polaganja?: Polaganje[];
    odbranaZavrsnogRada?: OdbranaZavrsnogRada;
    zavrsniRad?: ZavrsniRad;
    student?: Student;
}