import { Component, OnInit } from '@angular/core';
import { MedicInterface } from 'src/app/models/medic-interface';
import { DataApiService } from 'src/app/services/data-api.service';

@Component({
  selector: 'app-medic',
  templateUrl: './medic.component.html',
  styleUrls: ['./medic.component.css']
})
export class MedicComponent implements OnInit {

  public currentPage_: number = 1;
  public medics: any = [];

  constructor(private dataApiService: DataApiService) { }

  ngOnInit(): void {
    this.getListMedics();
  }

  getListMedics(): void {
    this.dataApiService
      .getAllMedics()
      .subscribe((medics: MedicInterface) => (this.medics = medics));
  }

}
