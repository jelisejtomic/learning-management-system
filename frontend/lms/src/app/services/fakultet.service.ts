import { Injectable } from '@angular/core';
import { Fakultet } from '../models/fakultet';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class FakultetService extends BaseService<Fakultet> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/fakultet/fakulteti`;
    }
}