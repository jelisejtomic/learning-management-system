import { Injectable } from '@angular/core';
import { Kontakt } from '../models/kontakt';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class KontaktService extends BaseService<Kontakt> {
    override url: string = `${this.url}/univerzitet/kontakti`;
}
