package com.company.JAVA_STUDIA_NOWE.Zadanie3_interfejsy_stos;

public class ElementStosu {

    public ObiektZdrukuj obiekt;
    public ElementStosu nastepny;

    public ElementStosu (ObiektZdrukuj obiekt, ElementStosu nastepny){
        this.obiekt = obiekt;
        this.nastepny = nastepny;
    }

}
