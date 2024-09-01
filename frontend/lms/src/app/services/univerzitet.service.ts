import { Injectable } from '@angular/core';
import { Univerzitet } from '../models/univerzitet';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class UniverzitetService extends BaseService<Univerzitet> {
    override url: string = `${this.url}/univerzitet/univerziteti`;
}
