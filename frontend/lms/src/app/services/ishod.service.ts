import { Injectable } from '@angular/core';
import { Ishod } from '../models/ishod';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class IshodService extends BaseService<Ishod> {
    override url: string = `${this.url}/ishodi`;
}
                