import { Injectable } from '@angular/core';
import { OdbranaZavrsnogRada } from '../models/odbrana-zavrsnog-rada';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class OdbranaZavrsnogRadaService extends BaseService<OdbranaZavrsnogRada> {
    override url: string = `${this.url}/ispit/odbraneZavrsnihRadova`;
}
