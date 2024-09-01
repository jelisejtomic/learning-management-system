import { Injectable } from '@angular/core';
import { PohadjanjePredmeta } from '../models/pohadjanje-predmeta';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class PohadjanjePredmetaService extends BaseService<PohadjanjePredmeta> {
    override url: string = `${this.url}/fakultet/pohadjanjaPredmeta`;
}
