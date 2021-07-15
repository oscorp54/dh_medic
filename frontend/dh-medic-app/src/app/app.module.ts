import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatListModule } from '@angular/material/list';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RouterModule, Routes } from '@angular/router';

import { NgxPaginationModule } from 'ngx-pagination';

import { MatIconModule } from '@angular/material/icon';
import { MatToolbarModule } from '@angular/material/toolbar';

import { AppComponent } from './app.component';
import { MenuComponent } from './components/menu/menu.component';
import { PatientComponent } from './components/patient/patient.component';
import { MedicComponent } from './components/medic/medic.component';
import { MedicalHistoryComponent } from './components/medical-history/medical-history.component';

const routes: Routes = [
  {path: 'patient', component: PatientComponent},
  {path: 'medic', component: MedicComponent},
  {path: 'medical-history', component: MedicalHistoryComponent},
];

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    PatientComponent,
    MedicComponent,
    MedicalHistoryComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    NgxPaginationModule,
    MatSidenavModule,
    MatListModule,
    BrowserAnimationsModule,
    MatIconModule,
    MatToolbarModule,
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule],
  providers: [],
  bootstrap: [
    AppComponent
  ]
})
export class AppModule { }
