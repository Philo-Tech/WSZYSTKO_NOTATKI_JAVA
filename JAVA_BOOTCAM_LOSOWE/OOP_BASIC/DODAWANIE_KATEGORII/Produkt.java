package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.DODAWANIE_KATEGORII;

public class Produkt {

    private String name;
    private int nrIDproduktu =0;

    public Produkt(String name) {
        this.name = name;
        this.nrIDproduktu++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNrIDproduktu() {
        return nrIDproduktu;
    }

    public void setNrIDproduktu(int nrIDproduktu) {
        this.nrIDproduktu = nrIDproduktu;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", nrIDproduktu=" + nrIDproduktu +
                '}';
    }
}
