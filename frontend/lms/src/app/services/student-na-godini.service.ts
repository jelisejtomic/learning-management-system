import { Injectable } from '@angular/core';
import { StudentNaGodini } from '../models/student-na-godini';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class StudentNaGodiniService extends BaseService<StudentNaGodini> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/fakultet/studentiNaGodinama`;
    }
}