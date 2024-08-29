import { Injectable } from '@angular/core';
import { NastavniMaterijal } from '../models/nastavni-materijal';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class NastavniMaterijalService extends BaseService<NastavniMaterijal> {
    override url: string = `${this.url}/nastavniMaterijali`;
}
                