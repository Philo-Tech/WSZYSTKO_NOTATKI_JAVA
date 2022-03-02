package com.company.JAVA10.Zadanie28_OOP.Test_Dziedziczenie.Buildings.Towers;

public class Tower {

    private String title;
    private int cost;
    private double demage;

    public Tower(){}
    public Tower(String title, int cost, double demage) {
        this.title = title;
        this.cost = cost;
        this.demage = demage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public double getDemage() {
        return demage;
    }

    public void setDemage(double demage) {
        this.demage = demage;
    }

    @Override
    public String toString() {
        return "Tower{" +
                "title='" + title + '\'' +
                ", cost=" + cost +
                ", demage=" + demage +
                '}';
    }
}
