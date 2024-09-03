import { Injectable } from '@angular/core';
import { Fajl } from '../models/fajl';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class FajlService extends BaseService<Fajl> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/fakultet/fajlovi`;
    }
}