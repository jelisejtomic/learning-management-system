import { Injectable } from '@angular/core';
import { OsobljeStudentskeSluzbe } from '../models/osoblje-studentske-sluzbe';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class OsobljeStudentskeSluzbeService extends BaseService<OsobljeStudentskeSluzbe> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/security/osobljeSluzbe`;
    }
}