package com.company.JAVA_STUDIA_NOWE.Zadanie5_gra1;

public class Mag extends Postac{

    private double silaCzarow;
    private double energia;


    public Mag(String nazwa, int hp, String odzew) {
        super(nazwa, hp, odzew);

        this.silaCzarow = new ParametryGry().getPocztakowaSilaMaga();
        this.energia = new ParametryGry().getPoczatkowaEnergiaMaga();
    }

    public void atak(){
        this.energia-= new ParametryGry().getSpadekEnergiaMaga();
        this.silaCzarow=energia * new ParametryGry().getZmianaSilyCzarowMaga();
    }
}
