import { Injectable } from '@angular/core';
import { Uloga } from '../models/uloga';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class UlogaService extends BaseService<Uloga> {
    override url: string = `${this.url}/uloge`;
}
