import { Injectable } from '@angular/core';
import { RegistrovaniKorisnik } from '../models/registrovani-korisnik';
import { BaseService } from './base.service';

@Injectable({
    providedIn: 'root',
})
export class RegistrovaniKorisnikService extends BaseService<RegistrovaniKorisnik> {
    override url: string = `${this.url}/security/registrovaniKorisnici`;
}
