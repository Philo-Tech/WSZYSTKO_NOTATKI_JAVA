package com.company.JAVA10.Zadanie28_OOP.Zadanie1;

public class Osoba {

    private String name;
    private String surName;
    private int pesel;

    public Osoba(String name, String surName, int pesel) {
        this.name = name;
        this.surName = surName;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return " Osoba: " +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", pesel=" + pesel;

    }
}
