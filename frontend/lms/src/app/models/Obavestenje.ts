import { Base } from "./Base";
import { Fajl } from "./Fajl";

export interface Obavestenje extends Base {
    vremePostavljanja?: Date;
    sadrzaj?: string;
    naslov?: string;
    fajlovi?: Fajl[];
}
