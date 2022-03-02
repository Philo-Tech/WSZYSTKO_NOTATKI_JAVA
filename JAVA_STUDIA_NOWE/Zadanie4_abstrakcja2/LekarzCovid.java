package com.company.JAVA_STUDIA_NOWE.Zadanie4_abstrakcja2;

public class LekarzCovid extends LekarzSpecjalista {


    public LekarzCovid(String imie, String nazwisko, double liczbaPrzyjetychPacjentow, String specjalnosc) {
        super(imie, nazwisko, liczbaPrzyjetychPacjentow, "Covid");// specjalność ustawiona na sztywno
    }

    // metoda ywswietl() nie bedzie sie niczym różniła dlatego nie nadpisujemy, bo i tak dziedziczymy ją po klasie "LekarzSpecjalista"

    public double ileDoWyplaty(){
        return liczbaPrzyjetychPacjentow * ParametryFinansowe.getKwotaZaPacjentaCovid();
    }
}
