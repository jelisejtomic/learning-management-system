import { Injectable } from '@angular/core';
import { Fajl } from '../models/fajl';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class FajlService extends BaseService<Fajl> {
    override url: string = `${this.url}/fakultet/fajlovi`;
}
