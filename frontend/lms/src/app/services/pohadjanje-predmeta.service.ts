import { Injectable } from '@angular/core';
import { PohadjanjePredmeta } from '../models/pohadjanje-predmeta';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class PohadjanjePredmetaService extends BaseService<PohadjanjePredmeta> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/fakultet/pohadjanjaPredmeta`;
    }
}