import { Injectable } from '@angular/core';
import { TerminNastave } from '../models/termin-nastave';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class TerminNastaveService extends BaseService<TerminNastave> {
    override url: string = `${this.url}/terminiNastave`;
}
