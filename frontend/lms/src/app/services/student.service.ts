import { Injectable } from '@angular/core';
import { Student } from '../models/student';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root',
})
export class StudentService extends BaseService<Student> {

    constructor(http: HttpClient) {
        super(http);
        this.url += `/security/studenti`;
    }
}