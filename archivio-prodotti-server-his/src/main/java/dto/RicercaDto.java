/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Userù
 */
public class RicercaDto {

    String ricerca;

    public RicercaDto() {
    }

    public RicercaDto(String ricerca) {
        this.ricerca = ricerca;
    }

    public String getRicerca() {
        return ricerca;
    }

    public void setRicerca(String ricerca) {
        this.ricerca = ricerca;
    }

    @Override
    public String toString() {
        return "RicercaDto{" + "ricerca=" + ricerca + '}';
    }

}
