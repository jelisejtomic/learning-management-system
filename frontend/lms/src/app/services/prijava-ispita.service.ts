import { Injectable } from '@angular/core';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';
import { PrijavaIspita } from '../models/prijava-ispita';

@Injectable({
    providedIn: 'root'
})
export class PrijavaIspitaService extends BaseService<PrijavaIspita> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/ispit/prijaveIspita`;
    }
}