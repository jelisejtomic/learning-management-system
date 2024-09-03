import { Injectable } from '@angular/core';
import { Mesto } from '../models/mesto';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class MestoService extends BaseService<Mesto> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/univerzitet/mesta`;
    }
}