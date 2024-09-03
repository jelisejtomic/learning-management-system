import { Injectable } from '@angular/core';
import { Dokument } from '../models/dokument';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class DokumentService extends BaseService<Dokument> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/univerzitet/dokumenti`;
    }
}