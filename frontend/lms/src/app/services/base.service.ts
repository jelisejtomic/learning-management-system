import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from '../../env/environment';

@Injectable({
  providedIn: 'root'
})
export abstract class BaseService<T> {
  url: string = environment.baseUrl;

  constructor(public http: HttpClient) { }

  getAll(): Observable<T[]> {
    return this.http.get<T[]>(`${this.url}`);
  }

  getById(id: number[]): Observable<T[]> {
    return this.http.get<T[]>(`${this.url}/${id}`);
  }

  create(obj: T): Observable<T> {
    return this.http.post<T>(this.url, obj);
  }

  update(id: number, obj: T): Observable<T> {
    return this.http.put<T>(`${this.url}/${id}`, obj);
  }

  delete(id: number): Observable<T> {
    return this.http.delete<T>(`${this.url}/${id}`);
  }
}
