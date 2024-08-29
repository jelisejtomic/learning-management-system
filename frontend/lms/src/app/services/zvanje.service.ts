import { Injectable } from '@angular/core';
import { Zvanje } from '../models/zvanje';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class ZvanjeService extends BaseService<Zvanje> {
    override url: string = `${this.url}/zvanja`;
}
