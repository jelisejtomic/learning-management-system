import { Injectable } from '@angular/core';
import { BaseService } from './base.service';
import { PrijavaIspita } from '../models/prijava-ispita';

@Injectable({
  providedIn: 'root'
})
export class PrijavaIspitaService extends BaseService<PrijavaIspita> {
  override url: string = `${this.url}/ispit/prijaveIspita`;
}
