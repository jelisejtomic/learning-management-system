import { Injectable } from '@angular/core';
import { TipDokumenta } from '../models/tip-dokumenta';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class TipDokumentaService extends BaseService<TipDokumenta> {
    override url: string = `${this.url}/univerzitet/tipoviDokumenta`;
}
