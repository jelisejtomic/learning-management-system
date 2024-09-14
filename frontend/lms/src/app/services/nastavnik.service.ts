import { Injectable } from '@angular/core';
import { Nastavnik } from '../models/nastavnik';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';

@Injectable({
    providedIn: 'root',
})
export class NastavnikService extends BaseService<Nastavnik> {
    private nastavnikSubject = new BehaviorSubject<Nastavnik | null>(null);
    nastavnik$ = this.nastavnikSubject.asObservable();

    constructor(http: HttpClient) {
        super(http);
        this.url += `/security/nastavnici`;
    }

    getByUsername(username: string): Observable<Nastavnik> {
        return this.http.get<Nastavnik>(`${this.url}/username/${username}`);
    }

    setNastavnik(nastavnik: Nastavnik) {
        this.nastavnikSubject.next(nastavnik);
    }
}