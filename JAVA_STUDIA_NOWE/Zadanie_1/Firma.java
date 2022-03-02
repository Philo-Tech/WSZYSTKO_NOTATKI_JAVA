package com.company.JAVA_STUDIA_NOWE.Zadanie_1;

public class Firma {

    public static void main(String[] args) {

        Stos stos = new Stos();

        stos.dodaj(new Osoba("Jakiś", "Tomek"));
        stos.dodaj(new Osoba("Jakiś", "drugi"));
        stos.dodaj(new Osoba("Jakiś", "trzeci"));
        stos.dodaj(new Osoba("Jakiś", "czwarty"));

        stos.pobierzIwyswietlWszystkich();

    }
}
