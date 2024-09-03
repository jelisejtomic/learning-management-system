import { Injectable } from '@angular/core';
import { NastavniMaterijal } from '../models/nastavni-materijal';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class NastavniMaterijalService extends BaseService<NastavniMaterijal> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/fakultet/nastavniMaterijali`;
    }
}