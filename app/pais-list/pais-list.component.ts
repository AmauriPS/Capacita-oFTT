import { Component, OnInit } from '@angular/core';
import { PaisService } from '../pais.service';

@Component({
  selector: 'app-pais-list',
  templateUrl: './pais-list.component.html',
  styleUrls: ['./pais-list.component.css']
})
export class PaisListComponent implements OnInit {

  /*paises = [
    
      {id:1, nome:"Brasil"},
      {id:2, nome:"Portugal"},
      {id:3, nome:"Italia"}
     ];*/

     paises: any;
     
  constructor(private paisService:PaisService) { }

  ngOnInit() {

    this.paisService.findAll().subscribe(paises =>this.paises = paises);
  }

}
