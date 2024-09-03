import { Injectable } from '@angular/core';
import { Adresa } from '../models/adresa';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class AdresaService extends BaseService<Adresa> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/univerzitet/adrese`;
    }
}
