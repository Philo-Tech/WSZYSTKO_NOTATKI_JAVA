package com.company.JAVA_STUDIA_NOWE.Zadanie4_abstrakcja2;
// klasa stworzona jako druga wersja. Mozna nia zastapic klase Ksiegowosc

public abstract class ObiektZKontraktem {

    public abstract void wyswietl();
    public abstract double ileDoWyplaty();

    public void drukujPoleceniePrzelewu(){

        System.out.println("\nPolecenie przelewu\n");
        System.out.println("Imie i nazwisko: ");
        //System.out.println("dane odbiorcy: ");
        wyswietl();
        System.out.println("Kwota przelewu: " + ileDoWyplaty());
    }
}
