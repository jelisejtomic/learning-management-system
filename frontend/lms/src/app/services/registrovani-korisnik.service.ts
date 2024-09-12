import { Injectable } from '@angular/core';
import { RegistrovaniKorisnik } from '../models/registrovani-korisnik';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root',
})
export class RegistrovaniKorisnikService extends BaseService<RegistrovaniKorisnik> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/security/registrovaniKorisnici`;
    }

    getByUsername(username: string): Observable<RegistrovaniKorisnik> {
        return this.http.get<RegistrovaniKorisnik>(`${this.url}/username/${username}`);
    }
}