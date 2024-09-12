import { Routes } from '@angular/router';
import { KontaktComponent } from './components/kontakt/kontakt.component';
import { ZaposleniComponent } from './components/zaposleni/zaposleni.component';
import { HomeComponent } from './components/home/home.component';
import { FakultetiComponent } from './components/fakulteti/fakulteti.component';
import { AuthGuard } from './auth/auth.guard';
import { StudentPredmetComponent } from './components/e-student/student/student-predmet/student-predmet.component';
import { PrijavaIspitaComponent } from './components/e-student/student/prijava-ispita/prijava-ispita.component';
import { ObavestenjaPredmetiComponent } from './components/e-student/student/obavestenja-predmeti/obavestenja-predmeti.component';
import { IstorijaStudiranjaComponent } from './components/e-student/student/istorija-studiranja/istorija-studiranja.component';
import { EStudentComponent } from './components/e-student/e-student/e-student.component';
import { StudentComponent } from './components/e-student/student/student/student.component';
import { NastavnikComponent } from './components/e-student/nastavnik/nastavnik.component';
import { StudentskaSluzbaComponent } from './components/e-student/studentska-sluzba/studentska-sluzba.component';
import { AdminComponent } from './components/e-student/admin/admin.component';
import { PodesavanjaComponent } from './components/e-student/student/podesavanja/podesavanja.component';

export const routes: Routes = [
    { path: "", component: HomeComponent },
    { path: "kontakti", component: KontaktComponent },
    { path: "zaposleni", component: ZaposleniComponent },
    { path: "fakulteti", component: FakultetiComponent },

    {
        path: "e-student", component: EStudentComponent,
        data: { roles: ["ROLE_STUDENT", "ROLE_TEACHER", "ROLE_STAFF", "ROLE_ADMIN"] },
        canActivate: [AuthGuard],
    },

    {
        path: "student",
        component: StudentComponent,
        children: [
            { path: "obavestenja-predmeti", component: ObavestenjaPredmetiComponent },
            { path: "predmeti", component: StudentPredmetComponent },
            { path: "prijava-ispita", component: PrijavaIspitaComponent },
            { path: "istorija-studiranja", component: IstorijaStudiranjaComponent },
            { path: "podesavanja", component: PodesavanjaComponent }
        ],
        data: { roles: ["ROLE_STUDENT"] },
        canActivate: [AuthGuard],
    },

    {
        path: "nastavnik", component: NastavnikComponent,
        data: { roles: ["ROLE_TEACHER"] },
        canActivate: [AuthGuard],
    },
    {
        path: "studentska-sluzba", component: StudentskaSluzbaComponent,
        data: { roles: ["ROLE_STAFF"] },
        canActivate: [AuthGuard],
    },
    {
        path: "admin", component: AdminComponent,
        data: { roles: ["ROLE_ADMIN"] },
        canActivate: [AuthGuard],
    },

];
