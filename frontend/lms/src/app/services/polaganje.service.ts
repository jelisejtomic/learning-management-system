import { Injectable } from '@angular/core';
import { Polaganje } from '../models/polaganje';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class PolaganjeService extends BaseService<Polaganje> {
    override url: string = `${this.url}/ispit/polaganja`;
}
