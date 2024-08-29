import { Base } from "./Base";
import { Inventar } from "./Inventar";
import { Udzbenik } from "./Udzbenik";

export interface OsobljeStudentskeSluzbe extends Base {
    biografija?: string;
    inventar?: Inventar[];
    biblioteka?: Udzbenik[];
}