import { Component, OnInit } from '@angular/core';
import {FormBuilder } from '@angular/forms';
import { FormGroup} from '@angular/forms/src/model';
import { Pais } from '../pais';
import { PaisService } from '../pais.service';


@Component({
  selector: 'app-pais-form',
  templateUrl: './pais-form.component.html',
  styleUrls: ['./pais-form.component.css']
})
export class PaisFormComponent implements OnInit {

  paisForm:FormGroup

  constructor(private builder:FormBuilder,
      private paisService:PaisService) { }

  ngOnInit() {

    this.paisForm = this.builder.group({
      id:[],
      nome:[]
    },{});
  }

  save(pais:Pais){
    this.paisService.save(pais).subscribe(pais =>{
        console.log("Pais salvo com sucesso" );

    },
    (exception) =>{
      console.log(exception.error)
  }); 
  
    

  }


}
