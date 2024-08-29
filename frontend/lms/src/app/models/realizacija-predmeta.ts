import { Base } from "./base";
import { EvaluacijaZnanja } from "./evaluacija-znanja";
import { NastavnikNaRealizaciji } from "./nastavnik-na-realizaciji";
import { Obavestenje } from "./obavestenje";
import { Predmet } from "./predmet";
import { TerminNastave } from "./termin-nastave";

export interface RealizacijaPredmeta extends Base {
    godinaIzvodjenja?: number;
    nastavnici?: NastavnikNaRealizaciji;
    predmet?: Predmet;
    terminiNastave?: TerminNastave[];
    obavestenja?: Obavestenje[];
    evaluacijaZnanja?: EvaluacijaZnanja[];
}