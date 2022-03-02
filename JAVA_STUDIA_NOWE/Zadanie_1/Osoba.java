package com.company.JAVA_STUDIA_NOWE.Zadanie_1;

public class Osoba {

    private String imie;
    private String nazwisko;
    public int liczbaPracownikow;

    public Osoba (String imie, String nazwisko){

        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public void wyswietl(){

        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko + "\n");
    }
}
