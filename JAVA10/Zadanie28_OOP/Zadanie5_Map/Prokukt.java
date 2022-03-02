package com.company.JAVA10.Zadanie28_OOP.Zadanie5_Map;

public class Prokukt {

    private int id;
    private String nazwa;

    public Prokukt(int id, String nazwa) {
        this.id = id;
        this.nazwa = nazwa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Prokukt{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
