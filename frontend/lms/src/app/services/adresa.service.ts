import { Injectable } from '@angular/core';
import { Adresa } from '../models/adresa';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class AdresaService extends BaseService<Adresa> {
    override url: string = `${this.url}/univerzitet/adrese`;
}
