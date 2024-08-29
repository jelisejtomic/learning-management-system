import { Injectable } from '@angular/core';
import { Inventar } from '../models/inventar';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class InventarService extends BaseService<Inventar> {
    override url: string = `${this.url}/inventari`;
}
                