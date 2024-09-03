import { Routes } from '@angular/router';
import { KontaktComponent } from './components/kontakt/kontakt.component';
import { ZaposleniComponent } from './components/zaposleni/zaposleni.component';
import { HomeComponent } from './components/home/home.component';

export const routes: Routes = [
    //https://angular.dev/reference/migrations/route-lazy-loading
    // {
    //     path: "/resoruce", component: ResoruceComponent,
    //     data: { roles: "admin" }, canActivate: [AuthGuard]
    // }
    { path: "", component: HomeComponent },
    { path: "kontakti", component: KontaktComponent },
    { path: "zaposleni", component: ZaposleniComponent }
];
