import { Injectable } from '@angular/core';
import { TerminNastave } from '../models/termin-nastave';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class TerminNastaveService extends BaseService<TerminNastave> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/fakultet/terminiNastave`;
    }
}