import { Injectable } from '@angular/core';
import { NastavnikNaRealizaciji } from '../models/nastavnik-na-realizaciji';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root',
})
export class NastavnikNaRealizacijiService extends BaseService<NastavnikNaRealizaciji> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/fakultet/nastavniciNaRealizacijama`;
    }

    getAllByNastavnikId(nastavnikId: number): Observable<NastavnikNaRealizaciji[]> {
        return this.http.get<NastavnikNaRealizaciji[]>(`${this.url}/nastavnik/${nastavnikId}/realizacije`);
    }
}