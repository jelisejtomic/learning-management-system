import { Injectable } from '@angular/core';
import { RealizacijaPredmeta } from '../models/realizacija-predmeta';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class RealizacijaPredmetaService extends BaseService<RealizacijaPredmeta> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/fakultet/realizacijePredmeta`;
    }
}