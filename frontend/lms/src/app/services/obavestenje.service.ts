import { Injectable } from '@angular/core';
import { Obavestenje } from '../models/obavestenje';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class ObavestenjeService extends BaseService<Obavestenje> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/fakultet/obavestenja`;
    }
}