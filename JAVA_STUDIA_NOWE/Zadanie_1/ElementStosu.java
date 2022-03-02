package com.company.JAVA_STUDIA_NOWE.Zadanie_1;

public class ElementStosu {

    public Osoba osoba;
    public ElementStosu nastepny;

    public ElementStosu(Osoba osoba, ElementStosu nastepny){
        this.osoba = osoba;
        this.nastepny = nastepny;
    }
}
