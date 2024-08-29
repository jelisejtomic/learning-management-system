import { Base } from "./base";
import { Inventar } from "./inventar";
import { Udzbenik } from "./udzbenik";

export interface OsobljeStudentskeSluzbe extends Base {
    biografija?: string;
    inventar?: Inventar[];
    biblioteka?: Udzbenik[];
}