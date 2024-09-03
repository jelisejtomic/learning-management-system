import { Injectable } from '@angular/core';
import { EvaluacijaZnanja } from '../models/evaluacija-znanja';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class EvaluacijaZnanjaService extends BaseService<EvaluacijaZnanja> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/ispit/evaluacijeZnanja`;
    }
}