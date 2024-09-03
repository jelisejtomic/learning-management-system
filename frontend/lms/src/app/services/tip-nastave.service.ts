import { Injectable } from '@angular/core';
import { TipNastave } from '../models/tip-nastave';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class TipNastaveService extends BaseService<TipNastave> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/fakultet/tipoviNastave`;
    }
}