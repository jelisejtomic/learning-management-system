import { Injectable } from '@angular/core';
import { ObrazovniCilj } from '../models/obrazovni-cilj';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class ObrazovniCiljService extends BaseService<ObrazovniCilj> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/fakultet/obrazovniCiljevi`;
    }
}