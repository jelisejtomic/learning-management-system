import { Injectable } from '@angular/core';
import { TipDokumenta } from '../models/tip-dokumenta';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class TipDokumentaService extends BaseService<TipDokumenta> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/univerzitet/tipoviDokumenta`;
    }
}