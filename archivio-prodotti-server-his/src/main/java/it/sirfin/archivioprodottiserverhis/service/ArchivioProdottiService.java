/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivioprodottiserverhis.service;

import dto.ListaProdottiDto;
import it.sirfin.archivioprodottiserverhis.model.Prodotto;

public interface ArchivioProdottiService {

    ListaProdottiDto aggiungi(Prodotto p);

    ListaProdottiDto Aggiorna();

    ListaProdottiDto cancella(Prodotto p);
}
