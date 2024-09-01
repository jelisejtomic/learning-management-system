import { Injectable } from '@angular/core';
import { TipKontakta } from '../models/tip-kontakta';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class TipKontaktaService extends BaseService<TipKontakta> {
    override url: string = `${this.url}/univerzitet/tipoviKontakata`;
}
