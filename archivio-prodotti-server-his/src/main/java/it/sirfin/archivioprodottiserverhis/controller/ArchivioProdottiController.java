package it.sirfin.archivioprodottiserverhis.controller;

import dto.ProdottoDto;
import dto.ListaProdottiDto;
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
    public ListaProdottiDto aggiungi(@RequestBody ProdottoDto reqDto){
        return archivioProdottiService.aggiungi(reqDto.getProdotto());
    }
}
