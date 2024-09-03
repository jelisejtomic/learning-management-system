import { Injectable } from '@angular/core';
import { InstrumentEvaluacije } from '../models/instrument-evaluacije';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class InstrumentEvaluacijeService extends BaseService<InstrumentEvaluacije> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/ispit/instrumentiEvaluacije`;
    }
}