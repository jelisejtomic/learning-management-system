import { Base } from "./base";
import { Nastavnik } from "./nastavnik";
import { Obavestenje } from "./obavestenje";
import { RealizacijaPredmeta } from "./realizacija-predmeta";
import { TipNastave } from "./tip-nastave";

export interface NastavnikNaRealizaciji extends Base {
    brojCasova?: number;
    predavac?: Nastavnik;
    tipNastave?: TipNastave;
    realizacijaPredmeta?: RealizacijaPredmeta;
    obavestenja?: Obavestenje[];
}