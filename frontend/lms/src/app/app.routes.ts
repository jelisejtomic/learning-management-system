import { Routes } from '@angular/router';
import { KontaktComponent } from './components/kontakt/kontakt.component';
import { ZaposleniComponent } from './components/zaposleni/zaposleni.component';
import { HomeComponent } from './components/home/home.component';
import { FakultetiComponent } from './components/fakulteti/fakulteti.component';
import { AuthGuard } from './auth.guard';
import { StudentPredmetComponent } from './components/student/student-predmet/student-predmet.component';
import { PrijavaIspitaComponent } from './components/student/prijava-ispita/prijava-ispita.component';
import { ObavestenjaPredmetiComponent } from './components/student/obavestenja-predmeti/obavestenja-predmeti.component';
import { IstorijaStudiranjaComponent } from './components/student/istorija-studiranja/istorija-studiranja.component';

export const routes: Routes = [
    { path: "", component: HomeComponent },
    { path: "kontakti", component: KontaktComponent },
    { path: "zaposleni", component: ZaposleniComponent },
    { path: "fakulteti", component: FakultetiComponent },


    {
        path: "obavestenjaPredmeti", component: ObavestenjaPredmetiComponent,
        data: { roles: ["ROLE_STUDENT"] },
        canActivate: [AuthGuard]
    },
    {
        path: "studentPredmeti", component: StudentPredmetComponent,
        data: { roles: ["ROLE_STUDENT"] },
        canActivate: [AuthGuard]
    },
    {
        path: "prijavaIspita", component: PrijavaIspitaComponent,
        data: { roles: ["ROLE_STUDENT"] },
        canActivate: [AuthGuard]
    },
    {
        path: "istorijaStudiranja", component: IstorijaStudiranjaComponent,
        data: { roles: ["ROLE_STUDENT"] },
        canActivate: [AuthGuard]
    },
];
