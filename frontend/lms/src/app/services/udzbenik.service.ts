import { Injectable } from '@angular/core';
import { Udzbenik } from '../models/udzbenik';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class UdzbenikService extends BaseService<Udzbenik> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/fakultet/udzbenici`;
    }
}