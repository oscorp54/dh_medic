import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Digital Harvor APP';
  isReady = false;
  name:string = '';
  places:any = [
    {active: true, name: 'Universidad'},
    {active: true, name: 'Colegio'},
    {active: true, name: 'Escuela'},
    {active: false, name: 'Instituto'}
  ];

  constructor() {
    setTimeout(() => {
      this.isReady = true
    }, 3000);
  }

  showMessage() {
    alert("hello world!!!")
  }
}
