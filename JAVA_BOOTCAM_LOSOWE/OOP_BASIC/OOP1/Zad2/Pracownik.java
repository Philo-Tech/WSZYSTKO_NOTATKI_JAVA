package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.OOP1.Zad2;

import java.util.Locale;

public class Pracownik {

    private String imie;
    private String nazwisko;
    private double pensja;
    private int wiek;

    public Pracownik(){}

    private Pracownik(String imie, String nazwisko, double pensja, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pensja = pensja;
        this.wiek = wiek;
    }

    public void setImie(String imie) {
        if (imie.length() > 5 && (imie.substring(0, 1).equals(imie.substring(0, 1).toUpperCase(Locale.ROOT)))) {
            this.imie = imie;
        } else System.out.println("Za krótkie imie, albo z małej litery! ");
    }

    public String getImie() {
        return imie;
    }

    public double getYearSalary(double monthSalary){
        return monthSalary*12;
    }
}
