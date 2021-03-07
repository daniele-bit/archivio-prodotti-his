import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { ProdottoDto } from './prodotto-dto';
import { Prodotto } from './prodotto';
import { ListaProdottiDto } from './lista-prodotti-dto';
import { RicercaDto } from './ricerca-dto';
import { Certificate } from 'crypto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  prodotto = new Prodotto();
  criterioRicerca = "";
  prodotti: Prodotto[] = [];
  prodottoSconto: Prodotto;

constructor(private http: HttpClient) {
  this.aggiorna(this.criterioRicerca);
}

aggiungi() {
  let dto = new ProdottoDto();
  dto.prodotto = this.prodotto;
  this.http.post<ListaProdottiDto>("http://localhost:8080/aggiungi-prodotto", dto)
    .subscribe(p => this.prodotti = p.listaProdotti);
  this.prodotto = new Prodotto();
}
ricerca() {
  let criterio = new RicercaDto();
  criterio.ricerca = this.criterioRicerca;

  this.http.post<ListaProdottiDto>("http://localhost:8080/ricerca-prodotto", criterio)
    .subscribe(p => this.prodotti = p.listaProdotti);
}

cancella(p: Prodotto) {
  let dto = new ProdottoDto();
  dto.prodotto = p;

  let oss = this.http.post<ListaProdottiDto>("http://localhost:8080/cancella-prodotto", dto);
  oss.subscribe(p => this.prodotti = p.listaProdotti);
}

aggiorna(ricerca: string) {
  // let ricercaDto = new RicercaDto();
  // ricercaDto.ricerca = ricerca;

  // if (ricerca == "") {
  //   this.http.get<ListaProdottiDto>("http://localhost:8080/aggiorna-lista")
  //     .subscribe(c => {
  //       this.prodotti = c.listaProdotti;
  //     });
  // } else {
  //   console.log("Errore criterio");
  // }
  this.ricerca();
}

calcolaSconto(p: Prodotto) {
  this.prodottoSconto = p;
}
}
