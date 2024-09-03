import { Injectable } from '@angular/core';
import { TipKontakta } from '../models/tip-kontakta';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class TipKontaktaService extends BaseService<TipKontakta> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/univerzitet/tipoviKontakata`;
    }
}