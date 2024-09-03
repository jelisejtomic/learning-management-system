import { Injectable } from '@angular/core';
import { NastavnikNaRealizaciji } from '../models/nastavnik-na-realizaciji';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class NastavnikNaRealizacijiService extends BaseService<NastavnikNaRealizaciji> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/fakultet/nastavniciNaRealizacijama`;
    }
}