import { Injectable } from '@angular/core';
import { ObrazovniCilj } from '../../models/obrazovni-cilj';
import { BaseService } from '../base.service';

@Injectable({
    providedIn: 'root',
})
export class ObrazovniCiljService extends BaseService<ObrazovniCilj> {
    override url: string = `${this.url}/fakultet/obrazovniCiljevi`;
}
