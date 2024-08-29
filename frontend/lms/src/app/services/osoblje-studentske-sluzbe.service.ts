import { Injectable } from '@angular/core';
import { OsobljeStudentskeSluzbe } from '../models/osoblje-studentske-sluzbe';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class OsobljeStudentskeSluzbeService extends BaseService<OsobljeStudentskeSluzbe> {
    override url: string = `${this.url}/studentskaSluzba`;
}
