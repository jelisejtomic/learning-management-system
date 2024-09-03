import { Injectable } from '@angular/core';
import { Inventar } from '../models/inventar';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class InventarService extends BaseService<Inventar> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/fakultet/inventar`;
    }
}