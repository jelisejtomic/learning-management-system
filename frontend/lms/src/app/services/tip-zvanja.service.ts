import { Injectable } from '@angular/core';
import { TipZvanja } from '../models/tip-zvanja';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class TipZvanjaService extends BaseService<TipZvanja> {
    override url: string = `${this.url}/tipoviZvanja`;
}
