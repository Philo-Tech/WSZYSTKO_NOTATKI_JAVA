package com.company.JAVA_STUDIA_NOWE.Zadanie4_abstrakcja2;

public class LekarzSpecjalista extends Osoba {

    protected double liczbaPrzyjetychPacjentow;
    private String specjlnosc;

    public LekarzSpecjalista(String imie, String nazwisko, double liczbaPrzyjetychPacjentow, String specjalnosc) {
        super(imie, nazwisko);
        this.liczbaPrzyjetychPacjentow = liczbaPrzyjetychPacjentow;
        this.specjlnosc = specjalnosc;
    }
    public void wyswietl(){
        super.wyswietl();
        System.out.println("Specjalność: " + specjlnosc);
        System.out.println("Liczb przyjętych pacjentów: " + liczbaPrzyjetychPacjentow );
    }
    public double ileDoWyplaty(){
        return liczbaPrzyjetychPacjentow * ParametryFinansowe.getKwotaZaPacjentaDlaSpecjalisty();// metoda jest statyczna dlatego nie trzeba tworzyc obiektu
    }
}
