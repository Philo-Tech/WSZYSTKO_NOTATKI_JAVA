package com.company.JAVA_STUDIA_NOWE.Zadanie4_abstrakcja2;

public class Ksiegowosc {

    public void drukujPoleceniePrzelewu(IObiektZKontraktem obiekt){

        System.out.println("\nPolecenie przelewu\n");
        System.out.println("Imie i nazwisko: ");
        //System.out.println("dane odbiorcy: ");
        obiekt.wyswietl();
        System.out.println("Kwota przelewu: " + obiekt.ileDoWyplaty());
    }
}
