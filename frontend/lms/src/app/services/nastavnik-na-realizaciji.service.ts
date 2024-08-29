import { Injectable } from '@angular/core';
import { NastavnikNaRealizaciji } from '../models/nastavnik-na-realizaciji';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class NastavnikNaRealizacijiService extends BaseService<NastavnikNaRealizaciji> {
    override url: string = `${this.url}/nastavniciNaRealizaciji`;
}
