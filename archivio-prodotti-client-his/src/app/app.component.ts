import { Component } from '@angular/core';
import { Prodotto } from './prodotto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  prodotto = new Prodotto();
  criterioRicerca = "";
  prodotti: Prodotto[] = [];

  aggiungi(){}

  ricerca(){}

  cancella(p: Prodotto){}

  calcolaSconto(p: Prodotto){}
}
