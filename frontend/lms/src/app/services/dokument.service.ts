import { Injectable } from '@angular/core';
import { Dokument } from '../models/dokument';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class DokumentService extends BaseService<Dokument> {
    override url: string = `${this.url}/univerzitet/dokumenti`;
}
