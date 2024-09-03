import { Injectable } from '@angular/core';
import { Ishod } from '../models/ishod';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class IshodService extends BaseService<Ishod> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/fakultet/ishodi`;
    }
}