import { Injectable } from '@angular/core';
import { Obavestenje } from '../models/obavestenje';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class ObavestenjeService extends BaseService<Obavestenje> {
    override url: string = `${this.url}/obavestenja`;
}
