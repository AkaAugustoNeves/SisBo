import { Component, OnInit } from '@angular/core';
import { ObitoService } from './obito.service';
import { ObitoLista } from './shared/ObitoLista';

@Component({
  selector: 'app-obito',
  templateUrl: './obito.component.html',
  styleUrls: ['./obito.component.css']
})
export class ObitoComponent implements OnInit {
  obitos: ObitoLista[] = [];
  constructor(private obitoService: ObitoService) { }

  ngOnInit(): void {
    this.obitoService.getAll().subscribe(obitos => {
      this.obitos = obitos;
    })
    console.log(this.obitos);
  
  }

}
