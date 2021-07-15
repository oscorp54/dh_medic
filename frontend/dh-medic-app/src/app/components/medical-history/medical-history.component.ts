import { Component, OnInit } from '@angular/core';
import { MedicalHistoryInterface } from 'src/app/models/medical-history-interface';
import { DataApiService } from 'src/app/services/data-api.service';

@Component({
  selector: 'app-medical-history',
  templateUrl: './medical-history.component.html',
  styleUrls: ['./medical-history.component.css']
})
export class MedicalHistoryComponent implements OnInit {

  public currentPage_: number = 1;
  public medicalHistories: any = [];

  constructor(private dataApiService: DataApiService) { }

  ngOnInit(): void {
    this.getListMedicalHistories();
  }

  getListMedicalHistories(): void {
    this.dataApiService
      .getAllMedicalHistories()
      .subscribe((medicalHistories: MedicalHistoryInterface) => (this.medicalHistories = medicalHistories));
  }

}
