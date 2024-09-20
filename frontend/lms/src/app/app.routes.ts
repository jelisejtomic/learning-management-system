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
import { EStudentComponent } from './components/e-student/e-student.component';
import { StudentComponent } from './components/e-student/student/student.component';
import { NastavnikComponent } from './components/e-student/nastavnik/nastavnik.component';
import { StudentskaSluzbaComponent } from './components/e-student/studentska-sluzba/studentska-sluzba.component';
import { AdminComponent } from './components/e-student/admin/admin.component';
import { PodesavanjaComponent } from './components/e-student/student/podesavanja/podesavanja.component';
import { NastavnikPredmetComponent } from './components/e-student/nastavnik/nastavnik-predmet/nastavnik-predmet.component';
import { NastavnikPodesavanjaComponent } from './components/e-student/nastavnik/nastavnik-podesavanja/nastavnik-podesavanja.component';
import { FormiranjeRasporedaComponent } from './components/e-student/studentska-sluzba/formiranje-rasporeda/formiranje-rasporeda.component';
import { InventarComponent } from './components/e-student/studentska-sluzba/inventar/inventar.component';
import { IzdavanjePotvrdaComponent } from './components/e-student/studentska-sluzba/izdavanje-potvrda/izdavanje-potvrda.component';
import { IzdavanjeUdzbenikaComponent } from './components/e-student/studentska-sluzba/izdavanje-udzbenika/izdavanje-udzbenika.component';
import { ObjavljivanjeObavestenjaComponent } from './components/e-student/studentska-sluzba/objavljivanje-obavestenja/objavljivanje-obavestenja.component';
import { StudentskaSluzbaPodesavanjaComponent } from './components/e-student/studentska-sluzba/studentska-sluzba-podesavanja/studentska-sluzba-podesavanja.component';
import { UpisStudenataComponent } from './components/e-student/studentska-sluzba/upis-studenata/upis-studenata.component';
import { AdminKorisnikaComponent } from './components/e-student/admin/admin-korisnika/admin-korisnika.component';
import { AdminOrganizacijeComponent } from './components/e-student/admin/admin-organizacije/admin-organizacije.component';
import { AdminSifarnikaComponent } from './components/e-student/admin/admin-sifarnika/admin-sifarnika.component';
import { AdminStudijskihProgramaComponent } from './components/e-student/admin/admin-studijskih-programa/admin-studijskih-programa.component';
import { AdminNastavnikaOsobljaComponent } from './components/e-student/admin/admin-nastavnika-osoblja/admin-nastavnika-osoblja.component';
import { PredmetDetaljiComponent } from './components/predmet-detalji/predmet-detalji.component';
import { RegistrovaniKorisnikComponent } from './components/e-student/registrovani-korisnik/registrovani-korisnik.component';
import { RegistrovaniKorisnikPodesavanjaComponent } from './components/e-student/registrovani-korisnik/registrovani-korisnik-podesavanja/registrovani-korisnik-podesavanja.component';
import { EvaluacijaZnanjaComponent } from './components/e-student/nastavnik/prijave-ispita/evaluacija-znanja/evaluacija-znanja.component';

export const routes: Routes = [
    { path: "", component: HomeComponent },
    { path: "kontakti", component: KontaktComponent },
    { path: "zaposleni", component: ZaposleniComponent },
    { path: "fakulteti", component: FakultetiComponent },

    {
        path: "e-student", component: EStudentComponent,
        data: { roles: ["ROLE_USER", "ROLE_STUDENT", "ROLE_TEACHER", "ROLE_STAFF", "ROLE_ADMIN"] },
        canActivate: [AuthGuard],
    },

    {
        path: "registrovani-korisnik",
        component: RegistrovaniKorisnikComponent,
        children: [
            { path: "podesavanja", component: RegistrovaniKorisnikPodesavanjaComponent }
        ],
        data: { roles: ["ROLE_USER"] },
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
        children: [
            { path: "predmeti", component: NastavnikPredmetComponent },
            { path: "podesavanja", component: NastavnikPodesavanjaComponent },
            { path: 'predmeti/:id', component: PredmetDetaljiComponent },
            { path: 'evaluacije/:realizacijaPredmetaId/:prijavaIspitaId', component: EvaluacijaZnanjaComponent },
        ],
        data: { roles: ["ROLE_TEACHER"] },
        canActivate: [AuthGuard],
    },

    {
        path: "studentska-sluzba", component: StudentskaSluzbaComponent,
        children: [
            { path: "upis-studenata", component: UpisStudenataComponent },
            { path: "izdavanje-potvrda", component: IzdavanjePotvrdaComponent },
            { path: "formiranje-rasporeda", component: FormiranjeRasporedaComponent },
            { path: "objavljivanje-obavestenja", component: ObjavljivanjeObavestenjaComponent },
            { path: "izdavanje-udzbenika", component: IzdavanjeUdzbenikaComponent },
            { path: "inventar", component: InventarComponent },
            { path: "podesavanja", component: StudentskaSluzbaPodesavanjaComponent }
        ],
        data: { roles: ["ROLE_STAFF"] },
        canActivate: [AuthGuard],
    },

    {
        path: "admin", component: AdminComponent,
        children: [
            { path: 'administracija-sifarnika', component: AdminSifarnikaComponent },
            { path: 'administracija-korisnika', component: AdminKorisnikaComponent },
            { path: 'administracija-studijskih-programa', component: AdminStudijskihProgramaComponent },
            { path: 'administracija-organizacije', component: AdminOrganizacijeComponent },
            { path: 'dodavanje-nastavnika-osoblja', component: AdminNastavnikaOsobljaComponent },
        ],
        data: { roles: ["ROLE_ADMIN"] },
        canActivate: [AuthGuard],
    },

];
