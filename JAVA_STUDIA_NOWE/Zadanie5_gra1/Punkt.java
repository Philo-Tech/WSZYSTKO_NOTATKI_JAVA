package com.company.JAVA_STUDIA_NOWE.Zadanie5_gra1;

public class Punkt {

    private double x;
    private double y;

    public Punkt(double x, double y){
        this.x = x;
        this.y=y;
    }
    public void zmien(double x, double y){
        this.x = x;
        this.y = y;

    }

    public Punkt pobierz(){
        return this;
    }

    public void wyswietl(){

        System.out.println(x + " " + y);
    }
}
