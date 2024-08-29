import { Injectable } from '@angular/core';
import { NaucnaOblast } from '../models/naucna-oblast';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class NaucnaOblastService extends BaseService<NaucnaOblast> {
    override url: string = `${this.url}/naucneOblasti`;
}
