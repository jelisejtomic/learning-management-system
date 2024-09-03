import { Injectable } from '@angular/core';
import { Administrator } from '../models/administrator';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AdministratorService extends BaseService<Administrator> {

  constructor(http: HttpClient) {
    super(http);
    this.url += `/security/administratori`;
  }
}
