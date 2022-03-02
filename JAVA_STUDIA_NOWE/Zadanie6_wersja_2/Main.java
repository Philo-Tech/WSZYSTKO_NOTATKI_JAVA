package com.company.JAVA_STUDIA_NOWE.Zadanie6_wersja_2;



public class Main {

    public static void main(String[] args) {

        System.out.println("FIRMA Z ZADANIAMI");

        Firma firma = new Firma("ABC");

        Zadanie zadanie1 = new Zadanie("Zadanie 1", "pierwsze zadanie do zrobienia", "do zrobienia",
                10,new Pracownik("Tomek", "jakis", "student"));

        firma.getBazaDanych().getZadania().dodajZadanie(zadanie1);

        Zadanie zadanie2 = new Zadanie("Zadanie 2", "drugie zadanie do zrobienia", "do zrobienia",
                5,new Pracownik("Konrad", "jakis", "właściciel"));

        firma.getBazaDanych().getZadania().dodajZadanie(zadanie2);

        firma.getBazaDanych().getZadania().wyswietlWszystkieZadania();



    }
}

