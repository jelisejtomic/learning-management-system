import { Base } from "./base";
import { Ishod } from "./ishod";

export interface Predmet extends Base {
    akronim?: string;
    naziv?: string;
    espb?: number;
    obavezan?: boolean;
    semestar?: number;
    semestarTrajanje?: number;
    brojPredavanja?: number;
    brojVezbi?: number;
    drugiObliciNastave?: number;
    istrazivackiRad?: number;
    ostaliCasovi?: number;
    stranicaPredmeta?: string;
    silabus?: Ishod[];
    preduslov?: Predmet;
    //?	obavestenja?: Obavestenje[];
}
