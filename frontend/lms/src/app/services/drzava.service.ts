import { Injectable } from '@angular/core';
import { Drzava } from '../models/drzava';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class DrzavaService extends BaseService<Drzava> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/univerzitet/drzave`;
    }
}