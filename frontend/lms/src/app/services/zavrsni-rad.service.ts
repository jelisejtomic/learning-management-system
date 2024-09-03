import { Injectable } from '@angular/core';
import { ZavrsniRad } from '../models/zavrsni-rad';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class ZavrsniRadService extends BaseService<ZavrsniRad> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/ispit/zavrsniRadovi`;
    }
}