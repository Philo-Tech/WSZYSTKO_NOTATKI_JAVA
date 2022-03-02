package com.company.JAVA_STUDIA_NOWE.Zadanie6_wersja_2;

import java.util.ArrayList;

public class Firma {

    private String nazwa;
    private BazaDanych bazaDanych;

    public Firma(String nazwa){
        this.nazwa = nazwa;
        this.bazaDanych = new BazaDanych();
    }

    public String getNazwa(){
        return this.nazwa;
    }
    public BazaDanych getBazaDanych(){
        return bazaDanych;
    }
}
