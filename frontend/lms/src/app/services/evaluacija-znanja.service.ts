import { Injectable } from '@angular/core';
import { EvaluacijaZnanja } from '../models/evaluacija-znanja';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class EvaluacijaZnanjaService extends BaseService<EvaluacijaZnanja> {
    override url: string = `${this.url}/ispit/evaluacijeZnanja`;
}
