import { Injectable } from '@angular/core';
import { GodinaStudija } from '../models/godina-studija';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class GodinaStudijaService extends BaseService<GodinaStudija> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/fakultet/godineStudija`;
    }
}