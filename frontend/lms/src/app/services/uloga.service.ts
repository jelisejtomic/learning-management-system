import { Injectable } from '@angular/core';
import { Uloga } from '../models/uloga';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class UlogaService extends BaseService<Uloga> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/security/uloge`;
    }
}