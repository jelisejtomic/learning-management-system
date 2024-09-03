import { Injectable } from '@angular/core';
import { Zvanje } from '../models/zvanje';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class ZvanjeService extends BaseService<Zvanje> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/fakultet/zvanja`;
    }
}