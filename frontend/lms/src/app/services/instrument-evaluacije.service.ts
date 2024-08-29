import { Injectable } from '@angular/core';
import { InstrumentEvaluacije } from '../models/instrument-evaluacije';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class InstrumentEvaluacijeService extends BaseService<InstrumentEvaluacije> {
    override url: string = `${this.url}/instrumentiEvaluacije`;
}
