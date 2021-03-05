package it.sirfin.archivioprodottiserverhis.service.impl;

import dto.ListaProdottiDto;
import it.sirfin.archivioprodottiserverhis.model.Prodotto;
import it.sirfin.archivioprodottiserverhis.repository.ProdottoRepository;
import it.sirfin.archivioprodottiserverhis.service.ArchivioProdottiService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class ArchivioProdottiServiceImpl implements ArchivioProdottiService {

    @Autowired
    ProdottoRepository prodottoRepository;

    @Override
    public ListaProdottiDto aggiungi(Prodotto p) {
        prodottoRepository.save(p);
        return Aggiorna();
    }

    @Override
    public ListaProdottiDto Aggiorna() {
        ListaProdottiDto lista = new ListaProdottiDto(
                prodottoRepository.findAll());
        return lista;
    }

}
