import { Injectable } from '@angular/core';
import { Fakultet } from '../models/fakultet';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class FakultetService extends BaseService<Fakultet> {
    override url: string = `${this.url}/fakultet/fakulteti`;
}
