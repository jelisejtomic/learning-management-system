import { Injectable } from '@angular/core';
import { IspitniRok } from '../models/ispitni-rok';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class IspitniRokService extends BaseService<IspitniRok> {

  constructor(http: HttpClient) {
    super(http);
    this.url += `/ispit/ispitniRokovi`;
  }
}