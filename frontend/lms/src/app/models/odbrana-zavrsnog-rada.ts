import { Base } from "./base";
import { ZavrsniRad } from "./zavrsni-rad";

export interface OdbranaZavrsnogRada extends Base {
    vremePocetka?: Date;
    vremeKraja?: Date;
    mestoOdrzavanja?: string;
    minBodovi?: number;
    maxBodovi?: number;
    ostvareniBodovi?: number;
    zavrsniRad?: ZavrsniRad;
}