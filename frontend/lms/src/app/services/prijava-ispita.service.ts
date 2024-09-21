import { Injectable } from '@angular/core';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';
import { PrijavaIspita } from '../models/prijava-ispita';
import { BehaviorSubject } from 'rxjs';

@Injectable({
    providedIn: 'root'
})
export class PrijavaIspitaService extends BaseService<PrijavaIspita> {
    private prijavaIspitaSubject = new BehaviorSubject<PrijavaIspita[]>([]);
    prijavaIspita$ = this.prijavaIspitaSubject.asObservable();

    constructor(http: HttpClient) {
        super(http);
        this.url += `/ispit/prijaveIspita`;
    }

    updatePrijavaIspita(data: PrijavaIspita[]) {
        this.prijavaIspitaSubject.next([...data]);
      }
}