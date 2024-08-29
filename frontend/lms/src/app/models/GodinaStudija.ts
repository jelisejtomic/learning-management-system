import { Base } from "./Base";
import { Predmet } from "./Predmet";
import { StudijskiProgram } from "./StudijskiProgram";

export interface GodinaStudija extends Base {
    godina?: Date;
    pocetak?: Date;
    kraj?: Date;
    studijskiProgram?: StudijskiProgram;
    predmeti: Predmet[];
}