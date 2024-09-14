import { Injectable } from '@angular/core';
import { Administrator } from '../models/administrator';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdministratorService extends BaseService<Administrator> {
  private administratorSubject = new BehaviorSubject<Administrator | null>(null);
  administrator$ = this.administratorSubject.asObservable();


  constructor(http: HttpClient) {
    super(http);
    this.url += `/security/administratori`;
  }

  getByUsername(username: string): Observable<Administrator> {
    return this.http.get<Administrator>(`${this.url}/username/${username}`);
  }

  setAdministrator(admin: Administrator) {
    this.administratorSubject.next(admin);
  }
}
