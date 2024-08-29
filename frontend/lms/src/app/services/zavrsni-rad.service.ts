import { Injectable } from '@angular/core';
import { ZavrsniRad } from '../models/zavrsni-rad';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class ZavrsniRadService extends BaseService<ZavrsniRad> {
    override url: string = `${this.url}/zavrsniRadovi`;
}
