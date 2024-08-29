import { Base } from "./Base";
import { EvaluacijaZnanja } from "./EvaluacijaZnanja";
import { NastavnikNaRealizaciji } from "./NastavnikNaRealizaciji";
import { Obavestenje } from "./Obavestenje";
import { Predmet } from "./Predmet";
import { TerminNastave } from "./TerminNastave";

export interface RealizacijaPredmeta extends Base {
    godinaIzvodjenja?: number;
    nastavnici?: NastavnikNaRealizaciji;
    predmet?: Predmet;
    terminiNastave?: TerminNastave[];
    obavestenja?: Obavestenje[];
    evaluacijaZnanja?: EvaluacijaZnanja[];
}