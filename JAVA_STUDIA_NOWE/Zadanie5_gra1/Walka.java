package com.company.JAVA_STUDIA_NOWE.Zadanie5_gra1;

public class Walka {

    public void walcz(Postac postac1, Postac postac2, double x, double y){
        postac1.zmienPozycje(x,y);
        postac2.zmienPozycje(x,y);
        postac1.atak();
        postac2.atak();
        postac1.prezentuj();
        postac2.prezentuj();
    }
}
