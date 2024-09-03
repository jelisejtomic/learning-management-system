import { Injectable } from '@angular/core';
import { StudijskiProgram } from '../models/studijski-program';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class StudijskiProgramService extends BaseService<StudijskiProgram> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/fakultet/studijskiProgrami`;
    }
}