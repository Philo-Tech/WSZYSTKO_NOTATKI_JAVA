package com.company.JAVA_STUDIA_NOWE.Zadanie6_wersja_2;

// to jest zbiór zbiorów, czyli listy list
public class BazaDanych {

    private Zadania zadania;
    //private Pacownicy pracownicy;
    //private Zespoly zespoly;
    //private Projekty projekty;
    //private Samochody samochody;


    public BazaDanych(){

        zadania = new Zadania();
    }

    public Zadania getZadania(){
        return this.zadania;
    }

}
