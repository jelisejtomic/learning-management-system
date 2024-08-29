import { Injectable } from '@angular/core';
import { Student } from '../models/student';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class StudentService extends BaseService<Student> {
    override url: string = `${this.url}/studenti`;
}
                