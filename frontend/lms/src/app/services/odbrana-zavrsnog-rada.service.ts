import { Injectable } from '@angular/core';
import { OdbranaZavrsnogRada } from '../models/odbrana-zavrsnog-rada';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class OdbranaZavrsnogRadaService extends BaseService<OdbranaZavrsnogRada> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/ispit/odbraneZavrsnihRadova`;
    }
}