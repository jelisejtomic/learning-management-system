import { Injectable } from '@angular/core';
import { TipNastave } from '../models/tip-nastave';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class TipNastaveService extends BaseService<TipNastave> {
    override url: string = `${this.url}/tipoviNastave`;
}
