package com.company.JAVA_STUDIA_NOWE.Zadanie3_interfejsy_stos;

public class Stos {

    private ElementStosu wierzcholek;

    public Stos(){
        wierzcholek = null;
    }

    public void dodaj(ObiektZdrukuj obiekt){
        ElementStosu nowy = new ElementStosu(obiekt, wierzcholek);
        wierzcholek = nowy;
    }

    public ObiektZdrukuj pobierz(){

        ObiektZdrukuj obiekt = wierzcholek.obiekt;
        wierzcholek = wierzcholek.nastepny;
        return obiekt;
    }

    public void pobierzIwyswietlWszystkich(){

        while(wierzcholek != null){

            pobierz().wyswietl();
        }
    }
}
