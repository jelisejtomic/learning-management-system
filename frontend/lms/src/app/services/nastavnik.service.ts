import { Injectable } from '@angular/core';
import { Nastavnik } from '../models/nastavnik';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class NastavnikService extends BaseService<Nastavnik> {
    override url: string = `${this.url}/nastavnici`;
}
