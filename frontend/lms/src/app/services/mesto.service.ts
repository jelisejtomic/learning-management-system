import { Injectable } from '@angular/core';
import { Mesto } from '../models/mesto';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class MestoService extends BaseService<Mesto> {
    override url: string = `${this.url}/mesta`;
}
