package com.company.JAVA_STUDIA_NOWE.Zadanie4_abstrakcja2;

public class Szpital implements IObiektZKontraktem {

    private String nazwa;
    private Adres adres;
    private double liczbaMiejsc;

    public Szpital(String nazwa, Adres adres, double liczbaMiejsc){
        this.nazwa = nazwa;
        this.adres = adres;
        this.liczbaMiejsc = liczbaMiejsc;
    }

    public void wyswietl(){
        System.out.println(nazwa);
        System.out.println(adres.toString());
    }

    @Override
    public double ileDoWyplaty(){
        return liczbaMiejsc * ParametryFinansowe.getKwotaZaMiejsceWszpitalu();
    }
}
