package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.DODAWANIE_KATEGORII;

public class Kategoria {

    private int nrIDkategorii;

    public Kategoria(int nrIDkategorii) {
        this.nrIDkategorii = nrIDkategorii;
    }

    public int getNrIDkategorii() {
        return nrIDkategorii;
    }

    public void setNrIDkategorii(int nrIDkategorii) {
        this.nrIDkategorii = nrIDkategorii;
    }

    @Override
    public String toString() {
        return "Kategoria{" +
                "nrIDkategorii=" + nrIDkategorii +
                '}';
    }
}
