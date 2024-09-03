import { Injectable } from '@angular/core';
import { Kontakt } from '../models/kontakt';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class KontaktService extends BaseService<Kontakt> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/univerzitet/kontakti`;
    }
}
