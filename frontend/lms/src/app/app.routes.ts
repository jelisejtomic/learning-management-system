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
    //https://angular.dev/reference/migrations/route-lazy-loading
    // {
    //     path: "/resoruce", component: ResoruceComponent,
    //     data: { roles: "admin" }, canActivate: [AuthGuard]
    // }
    { path: "", component: HomeComponent },
    { path: "kontakti", component: KontaktComponent },
    { path: "zaposleni", component: ZaposleniComponent },
    { path: "fakulteti", component: FakultetiComponent },


    //dodati guard na sve rute ispod
    { path: "obavestenjaPredmeti", component: ObavestenjaPredmetiComponent },
    { path: "studentPredmeti", component: StudentPredmetComponent },
    { path: "prijavaIspita", component: PrijavaIspitaComponent },
    { path: "istorijaStudiranja", component: IstorijaStudiranjaComponent },

    // {
    //     path: "estudent", component: EStudentComponent,
    //     data: { roles: ["ROLE_STUDENT"] },
    //     canActivate: [AuthGuard]
    // }
];
