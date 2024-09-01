import { Injectable } from '@angular/core';
import { Administrator } from '../models/administrator';
import { BaseService } from './base.service';

@Injectable({
  providedIn: 'root'
})
export class AdministratorService extends BaseService<Administrator> {
  override url: string = `${this.url}/security/administratori`;
}
