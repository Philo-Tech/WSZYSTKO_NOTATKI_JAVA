package com.company.JAVA_STUDIA_NOWE.Zadanie_1;

public class Stos {

    private ElementStosu wierzcholek;

    public Stos(){
        wierzcholek = null;
    }

    public void dodaj(Osoba obiekt){
        ElementStosu nowy = new ElementStosu(obiekt, wierzcholek);
        wierzcholek = nowy;
    }

    public Osoba pobierz(){

        Osoba osoba = wierzcholek.osoba;
        wierzcholek = wierzcholek.nastepny;
        return osoba;
    }

    public void pobierzIwyswietlWszystkich(){

        while(wierzcholek != null){

            pobierz().wyswietl();
        }
    }
}
