import { Injectable } from '@angular/core';
import { RealizacijaPredmeta } from '../models/realizacija-predmeta';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class RealizacijaPredmetaService extends BaseService<RealizacijaPredmeta> {
    override url: string = `${this.url}/fakultet/realizacijePredmeta`;
}
