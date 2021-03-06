package it.sirfin.archivioprodottiserverhis.controller;

import dto.ProdottoDto;
import dto.ListaProdottiDto;
import dto.RicercaDto;
import it.sirfin.archivioprodottiserverhis.service.ArchivioProdottiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class ArchivioProdottiController {

    @Autowired
    ArchivioProdottiService archivioProdottiService;

    @RequestMapping("/aggiungi-prodotto")
    @ResponseBody
    public ListaProdottiDto aggiungi(@RequestBody ProdottoDto reqDto) {
        return archivioProdottiService.aggiungi(reqDto.getProdotto());
    }

    @RequestMapping("/cancella-prodotto")
    @ResponseBody
    public ListaProdottiDto cancella(@RequestBody ProdottoDto reqDto) {
        return archivioProdottiService.cancella(reqDto.getProdotto());

    }

    @RequestMapping("/ricerca-prodotto")
    @ResponseBody
    public ListaProdottiDto ricerca(@RequestBody RicercaDto reqDto) {
        return archivioProdottiService.ricerca(reqDto.getRicerca());
    }
    
      @RequestMapping("/aggiorna-lista")
    @ResponseBody
    public ListaProdottiDto aggiornaListaClienti() {
        return archivioProdottiService.aggiorna();
    }
}
