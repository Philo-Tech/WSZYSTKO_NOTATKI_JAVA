package com.company.JAVA10.Zadanie28_OOP.Zadanie2;

public class Main {

    public static void main(String[] args) {

        Pracownik base = new Pracownik();
        Pracownik pracownik = base.createNewPracownik("Janek", "Fasola",3400.0,34);

        Pracownik pracownik2 = base.createNewPracownik("x", "f",34, 34);
        base.getSalaryPerYear(pracownik2);



        System.out.println (pracownik + " Roczna pencja wynosi: " + pracownik.getYearGeld(pracownik.getPensja()));
        System.out.println (pracownik2);

        //System.out.println(pracownik + "\nPensja roczna wynosi --> " + pracownik.getYearGeld(pracownik.getPensja()));
    }
}
