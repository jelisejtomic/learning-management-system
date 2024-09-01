import { Injectable } from '@angular/core';
import { IspitniRok } from '../models/ispitni-rok';
import { BaseService } from './base.service';

@Injectable({
  providedIn: 'root'
})
export class IspitniRokService extends BaseService<IspitniRok> {
  override url: string = `${this.url}/ispit/ispitniRokovi`;
}
