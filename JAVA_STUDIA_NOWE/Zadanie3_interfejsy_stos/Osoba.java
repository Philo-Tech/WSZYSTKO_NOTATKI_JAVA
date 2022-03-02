package com.company.JAVA_STUDIA_NOWE.Zadanie3_interfejsy_stos;

public class Osoba implements ObiektZdrukuj {

    private String imie;
    private String nazwisko;

    public Osoba(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override // metoda obowiązkowo implementowana z interfejsu, ponieważ klasa implementuje interfejs "ObiektZdrukuj"
    public void wyswietl() {

        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
    }
}
