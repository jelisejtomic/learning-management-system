import { Injectable } from '@angular/core';
import { Univerzitet } from '../models/univerzitet';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class UniverzitetService extends BaseService<Univerzitet> {

    constructor(http: HttpClient) {
        super(http);
        this.url += '/univerzitet/univerziteti';
    }
}
