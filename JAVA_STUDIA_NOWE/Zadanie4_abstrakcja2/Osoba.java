package com.company.JAVA_STUDIA_NOWE.Zadanie4_abstrakcja2;

public class Osoba implements IObiektZKontraktem {
    private String imie;
    private String nazwisko;

    public Osoba(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void wyswietl() {

        System.out.println(imie +" "+ nazwisko );
    }

    @Override
    public double ileDoWyplaty() {
        return 0;
    }
}
