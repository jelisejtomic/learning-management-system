import { Base } from "./base";
import { Fajl } from "./fajl";

export interface Obavestenje extends Base {
    vremePostavljanja?: Date;
    sadrzaj?: string;
    naslov?: string;
    fajlovi?: Fajl[];
}
