package com.company.JAVA_STUDIA_NOWE.Zadanie4_abstrakcja2;

public class LekarzRodzinny extends Osoba {

    private double liczbaZapisanychPacjentow;

    public LekarzRodzinny(String imie, String nazwisko, double liczbaZapisanychPacjentow) {
        super(imie, nazwisko);
        this.liczbaZapisanychPacjentow = liczbaZapisanychPacjentow;
    }

    public void wyswietl(){

        super.wyswietl();
        System.out.println("Liczba zapisanych pacjentów: " + liczbaZapisanychPacjentow);
    }

    public double ileDoWyplaty(){
        return liczbaZapisanychPacjentow * new ParametryFinansowe().getKwotaZaPacjentaPodstawowegoKontaktu();
    }
}
