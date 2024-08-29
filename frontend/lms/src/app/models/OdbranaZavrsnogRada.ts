import { Base } from "./Base";
import { ZavrsniRad } from "./ZavrsniRad";

export interface OdbranaZavrsnogRada extends Base {
    vremePocetka?: Date;
    vremeKraja?: Date;
    mestoOdrzavanja?: string;
    minBodovi?: number;
    maxBodovi?: number;
    ostvareniBodovi?: number;
    zavrsniRad?: ZavrsniRad;
}