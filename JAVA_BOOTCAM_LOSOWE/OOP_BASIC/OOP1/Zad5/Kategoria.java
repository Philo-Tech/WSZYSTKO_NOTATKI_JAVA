package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.OOP1.Zad5;

import java.util.Objects;

public class Kategoria {

    private String nazwa;

    public Kategoria(){}

    public Kategoria(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kategoria kategoria = (Kategoria) o;
        return Objects.equals(nazwa, kategoria.nazwa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa);
    }

    @Override
    public String toString() {
        return "Kategoria{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }
}
