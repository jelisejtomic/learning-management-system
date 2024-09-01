import { Injectable } from '@angular/core';
import { Predmet } from '../models/predmet';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class PredmetService extends BaseService<Predmet> {
    override url: string = `${this.url}/fakultet/predmeti`;
}
