package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.DODAWANIE_KATEGORII;

public class Baza {

    private Kategoria kategoria;
    private Produkt produkt;

    public Baza(Kategoria kategoria, Produkt produkt) {
        this.kategoria = kategoria;
        this.produkt = produkt;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }

    public void setKategoria(Kategoria kategoria) {
        this.kategoria = kategoria;
    }

    public Produkt getProdukt() {
        return produkt;
    }

    public void setProdukt(Produkt produkt) {
        this.produkt = produkt;
    }

    @Override
    public String toString() {
        return "Baza{" +
                "kategoria=" + kategoria +
                ", produkt=" + produkt +
                '}';
    }
}
