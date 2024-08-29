import { Injectable } from '@angular/core';
import { StudijskiProgram } from '../models/studijski-program';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class StudijskiProgramService extends BaseService<StudijskiProgram> {
    override url: string = `${this.url}/studijskiProgrami`;
}
                