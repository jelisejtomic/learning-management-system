import { Injectable } from '@angular/core';
import { Univerzitet } from '../models/univerzitet';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Nastavnik } from '../models/nastavnik';

@Injectable({
    providedIn: 'root',
})
export class UniverzitetService extends BaseService<Univerzitet> {

    constructor(http: HttpClient) {
        super(http);
        this.url += '/univerzitet/univerziteti';
    }

    getNastavniciForUniverzitet(univerzitetId: number): Observable<Nastavnik[]> {
        return this.http.get<Nastavnik[]>(`${this.url}/${univerzitetId}/nastavnici`)
    }
}
