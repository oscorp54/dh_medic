import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import { MedicalHistoryInterface } from '../models/medical-history-interface';

@Injectable({
  providedIn: 'root'
})
export class DataApiService {

  patients!: Observable<any>;
  patient!: Observable<any>;

  headers: HttpHeaders = new HttpHeaders({
    'Content-Type': 'application/json'
  });

  constructor(private http: HttpClient) { }

  getAllPatients() {
    const url_api = 'http://localhost:8080/patient/list';
    return this.http.post(url_api, {});
  }

  getAllMedics() {
    const url_api = 'http://localhost:8080/medic/list';
    return this.http.post(url_api, {});
  }

  getAllMedicalHistories() {
    const url_api = 'http://localhost:8080/medicalhistory/list';
    return this.http.post(url_api, {});
  }

  createConsultationMedical(description_: string, consultationDate_: Date, prescriptionDrugs_: string, patientId_: number, medicId_: number) {
    const url_api = 'http://localhost:8080/medicalhistory/create';
    return this.http
      .post<MedicalHistoryInterface>(
        url_api,
        {
          description: description_,
          consultationDate: consultationDate_,
          prescriptionDrugs: prescriptionDrugs_,
          patient: {
            id: patientId_
          },
          medic: {
            id: medicId_
          }
        },
        { headers: this.headers }
      );
  }

}
