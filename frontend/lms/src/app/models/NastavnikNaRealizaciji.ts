import { Base } from "./Base";
import { Nastavnik } from "./Nastavnik";
import { Obavestenje } from "./Obavestenje";
import { RealizacijaPredmeta } from "./RealizacijaPredmeta";
import { TipNastave } from "./TipNastave";

export interface NastavnikNaRealizaciji extends Base {
    brojCasova?: number;
    predavac?: Nastavnik;
    tipNastave?: TipNastave;
    realizacijaPredmeta?: RealizacijaPredmeta;
    obavestenja?: Obavestenje[];
}