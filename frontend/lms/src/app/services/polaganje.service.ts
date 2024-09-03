import { Injectable } from '@angular/core';
import { Polaganje } from '../models/polaganje';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class PolaganjeService extends BaseService<Polaganje> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/ispit/polaganja`;
    }
}