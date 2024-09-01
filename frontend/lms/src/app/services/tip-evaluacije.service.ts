import { Injectable } from '@angular/core';
import { TipEvaluacije } from '../models/tip-evaluacije';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class TipEvaluacijeService extends BaseService<TipEvaluacije> {
    override url: string = `${this.url}/ispit/tipoviEvaluacije`;
}
