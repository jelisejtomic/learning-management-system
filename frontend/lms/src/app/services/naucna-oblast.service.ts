import { Injectable } from '@angular/core';
import { NaucnaOblast } from '../models/naucna-oblast';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class NaucnaOblastService extends BaseService<NaucnaOblast> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/fakultet/naucneOblasti`;
    }
}