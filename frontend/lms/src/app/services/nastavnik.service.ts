import { Injectable } from '@angular/core';
import { Nastavnik } from '../models/nastavnik';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class NastavnikService extends BaseService<Nastavnik> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/security/nastavnici`;
    }
}