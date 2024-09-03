import { Injectable } from '@angular/core';
import { Predmet } from '../models/predmet';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class PredmetService extends BaseService<Predmet> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/fakultet/predmeti`;
    }
}