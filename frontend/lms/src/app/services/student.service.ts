import { Injectable } from '@angular/core';
import { Student } from '../models/student';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root',
})
export class StudentService extends BaseService<Student> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/security/studenti`;
    }

    getByUsername(username: string): Observable<Student> {
        return this.http.get<Student>(`${this.url}/username/${username}`);
    }
}