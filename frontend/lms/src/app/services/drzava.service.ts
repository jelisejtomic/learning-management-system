import { Injectable } from '@angular/core';
import { Drzava } from '../models/drzava';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class DrzavaService extends BaseService<Drzava> {
    override url: string = `${this.url}/univerzitet/drzave`;
}
