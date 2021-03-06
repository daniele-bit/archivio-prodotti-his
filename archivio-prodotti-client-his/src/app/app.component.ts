import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { ProdottoDto } from './prodotto-dto';
import { Prodotto } from './prodotto';
import { ListaProdottiDto } from './lista-prodotti-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  prodotto = new Prodotto();
  criterioRicerca = "";
  prodotti: Prodotto[] = [];

  constructor(private http: HttpClient) { }

  aggiungi() {
    let dto = new ProdottoDto();
    dto.prodotto = this.prodotto;
    this.http.post<ListaProdottiDto>("http://localhost:8080/aggiungi-prodotto", dto)
      .subscribe(p => this.prodotti = p.listaProdotti);
    this.prodotto = new Prodotto();
  }
  ricerca() { }

  cancella(p: Prodotto) {
    let dto = new ProdottoDto();
    dto.prodotto = p;

    let oss = this.http.post<ListaProdottiDto>("http://localhost:8080/cancella-prodotto", dto);
    oss.subscribe(p => this.prodotti = p.listaProdotti);
   }

  calcolaSconto(p: Prodotto) { }
}
