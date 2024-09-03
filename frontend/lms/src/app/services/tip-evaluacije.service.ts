import { Injectable } from '@angular/core';
import { TipEvaluacije } from '../models/tip-evaluacije';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class TipEvaluacijeService extends BaseService<TipEvaluacije> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/ispit/tipoviEvaluacije`;
    }
}