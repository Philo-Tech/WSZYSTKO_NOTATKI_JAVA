package com.company.JAVA10.Zadanie_33_Static_COUNTER;

public class Employe {

    private String name;
    private String position;
    public static int COUNTER = 0;
    private int id = 0;

    public Employe(String name, String position) {
        this.name = name;
        this.position = position;
        this.id = ++COUNTER;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", id=" + id +
                '}';
    }
}
