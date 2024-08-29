import { Injectable } from '@angular/core';
import { Udzbenik } from '../models/udzbenik';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class UdzbenikService extends BaseService<Udzbenik> {
    override url: string = `${this.url}/udzbenici`;
}
