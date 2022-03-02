package com.company.JAVA10.Zadanie28_OOP.Test_Dziedziczenie.Buildings.Towers;

public class BowTower extends Tower {

    private double damageRate;
    private double accuracy;


    public BowTower(){}
    public BowTower(String title, int cost, double demage, double damageRate, double accuracy) {
        super(title, cost + 200, demage);
        this.damageRate = damageRate;
        this.accuracy = accuracy;
    }

    public double getDamageRate() {
        return damageRate;
    }

    public void setDamageRate(double damageRate) {
        this.damageRate = damageRate;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public String toString() {
        return "BowTower --> " +
                " \ntitle: " + super.getTitle() +
                ", \nkoszt: " + super.getCost() +
                ", \ndamageRate: " + damageRate +
                ", \naccuracy: " + accuracy;
    }
}
