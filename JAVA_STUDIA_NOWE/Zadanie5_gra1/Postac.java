package com.company.JAVA_STUDIA_NOWE.Zadanie5_gra1;

public abstract class Postac {

    private String nazwa;
    private int hp;
    private String odzew;
    private Punkt pozycja;

    public Postac(String nazwa, int hp, String odzew){
        this.nazwa = nazwa;
        this.hp = hp;
        this.odzew = odzew;
        this.pozycja = new Punkt(0,0);
    }

    public void zmienPozycje(double x, double y){

        pozycja.zmien(x,y);
    }

    public void prezentuj(){
        System.out.println(odzew);
        System.out.println("Nazwa: " + nazwa);
        System.out.println("HP:" + hp);
        System.out.println("Pozycja: \n");
        pozycja.wyswietl();
    }
    public abstract void atak();
}
