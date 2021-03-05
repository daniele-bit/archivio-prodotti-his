package dto;

import it.sirfin.archivioprodottiserverhis.model.Prodotto;


public class ProdottoDto {
    private Prodotto prodotto;

    public ProdottoDto() {
    }

    public ProdottoDto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    @Override
    public String toString() {
        return "ReqAggiungiProdottoDto{" + "prodotto=" + prodotto + '}';
    }
    
    
}
