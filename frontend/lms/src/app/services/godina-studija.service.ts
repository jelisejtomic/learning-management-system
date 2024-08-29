import { Injectable } from '@angular/core';
import { GodinaStudija } from '../models/godina-studija';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class GodinaStudijaService extends BaseService<GodinaStudija> {
    override url: string = `${this.url}/godineStudija`;
}
