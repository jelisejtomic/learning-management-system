import { Injectable } from '@angular/core';
import { OsobljeStudentskeSluzbe } from '../models/osoblje-studentske-sluzbe';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';

@Injectable({
    providedIn: 'root',
})
export class OsobljeStudentskeSluzbeService extends BaseService<OsobljeStudentskeSluzbe> {
    private osobljeStudentskeSluzbeSubject = new BehaviorSubject<OsobljeStudentskeSluzbe | null>(null);
    osobljeStudentskeSluzbe$ = this.osobljeStudentskeSluzbeSubject.asObservable();

    constructor(http: HttpClient) {
        super(http);
        this.url += `/security/osobljeSluzbe`;
    }

    getByUsername(username: string): Observable<OsobljeStudentskeSluzbe> {
        return this.http.get<OsobljeStudentskeSluzbe>(`${this.url}/username/${username}`);
    }

    setOsobljeStudentskeSluzbe(osobljeStudentskeSluzbe: OsobljeStudentskeSluzbe) {
        this.osobljeStudentskeSluzbeSubject.next(osobljeStudentskeSluzbe);
    }
}