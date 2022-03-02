package com.company.ZadanieKlasy1;

import java.time.Period;

public class Person {

    private String imie;
    private int wiek;
    private boolean czyKobieta;

    public Person(){}
    public Person(String imie, int wiek, boolean czyKobieta){
        this.imie = imie;
        this.wiek = wiek;
        this.czyKobieta = czyKobieta;
    }

    public String getImie(){
        return imie;
    }

    public void setImie(String imie){
        this.imie = imie;
    }

    public int getWiek(){
        return wiek;
    }

    public void setWiek(int wiek){
        this.wiek = wiek;
    }

    public boolean getCzyKobieta(){
        return czyKobieta;
    }

    public void setCzyKobieta(boolean kobieta){
        czyKobieta = kobieta;
    }

    @Override // ponieważ to nie jest nasza metoda; dziedziczenie po klasie, z której dziedziczy nasza klasa-> z klasy Object
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", czyKobieta=" + czyKobieta +
                '}';
    }
}
