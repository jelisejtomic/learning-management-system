import { Injectable } from '@angular/core';
import { TipZvanja } from '../models/tip-zvanja';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class TipZvanjaService extends BaseService<TipZvanja> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/fakultet/tipoviZvanja`;
    }
}