package com.company.JAVA10.Zadanie28_OOP.Zadanie4;

public class User {

    private String name;
    private String subName;
    private String pesel;


    public User (){}
    public User (String name, String subName, String pesel) {
        this.name = name;
        this.subName = subName;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", subName='" + subName + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
