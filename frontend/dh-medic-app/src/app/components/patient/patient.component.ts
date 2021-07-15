import { Component, OnInit } from '@angular/core';
import { PatientInterface } from 'src/app/models/patient-interface';
import { DataApiService } from 'src/app/services/data-api.service';

@Component({
  selector: 'app-patient',
  templateUrl: './patient.component.html',
  styleUrls: ['./patient.component.css']
})
export class PatientComponent implements OnInit {

  public currentPage_: number = 1;
  public patients: any = [];

  constructor(private dataApiService: DataApiService) { }

  ngOnInit(): void {
    this.getListPatients();
  }

  getListPatients(): void {
    this.dataApiService
      .getAllPatients()
      .subscribe((patients: PatientInterface) => (this.patients = patients));
  }

}
