import { Injectable } from '@angular/core';
import { Student } from '../models/student';
import { BaseService } from './base.service';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';

@Injectable({
    providedIn: 'root',
})
export class StudentService extends BaseService<Student> {
    private studentSubject = new BehaviorSubject<Student | null>(null);
    student$ = this.studentSubject.asObservable();

    constructor(http: HttpClient) {
        super(http);
        this.url += `/security/studenti`;
    }

    getByUsername(username: string): Observable<Student> {
        return this.http.get<Student>(`${this.url}/username/${username}`);
    }

    setStudent(student: Student) {
        this.studentSubject.next(student);
    }
}