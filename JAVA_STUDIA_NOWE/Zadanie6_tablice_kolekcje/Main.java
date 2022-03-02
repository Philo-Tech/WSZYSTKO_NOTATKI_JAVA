package com.company.JAVA_STUDIA_NOWE.Zadanie6_tablice_kolekcje;

public class Main {

    public static void main(String[] args) {

        System.out.println("FIRMA Z ZADANIAMI");


        Zadania zadania = new Zadania();
        Zadanie zadanie1 = new Zadanie("Zadanie 1", "pierwsze zadanie do zrobienia", "do zrobienia",
                10,new Pracownik("Tomek", "jakis", "student"));
        Zadanie zadanie2 = new Zadanie("Zadanie 2", "drugie zadanie do zrobienia", "do zrobienia",
                5,new Pracownik("Konrad", "jakis", "właściciel"));

        zadania.dodajZadanie(zadanie1);
        zadania.dodajZadanie(zadanie2);
        zadania.wyswietlWszystkieZadania();

        }
    }

