import { Injectable } from '@angular/core';
import { StudentNaGodini } from '../models/student-na-godini';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class StudentNaGodiniService extends BaseService<StudentNaGodini> {
    override url: string = `${this.url}/fakultet/studentiNaGodinama`;
}
