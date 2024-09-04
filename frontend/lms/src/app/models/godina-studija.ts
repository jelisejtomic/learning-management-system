import { Base } from "./base";
import { Predmet } from "./predmet";
import { StudijskiProgram } from "./studijski-program";

export interface GodinaStudija extends Base {
    godina?: number;
    pocetak?: Date;
    kraj?: Date;
    studijskiProgram?: StudijskiProgram;
    predmeti: Predmet[];
}