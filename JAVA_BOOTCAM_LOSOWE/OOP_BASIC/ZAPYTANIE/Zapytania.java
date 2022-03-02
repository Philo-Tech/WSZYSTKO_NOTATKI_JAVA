package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.ZAPYTANIE;


import java.util.List;

public class Zapytania {

    private Uzytkownik uzytkownik;
    private int data;

    public Zapytania(Uzytkownik uzytkownik, int data) {
        this.uzytkownik = uzytkownik;
        this.data = data;
    }

    public Uzytkownik getUzytkownik() {
        return uzytkownik;
    }

    public void setUzytkownik(Uzytkownik uzytkownik) {
        this.uzytkownik = uzytkownik;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean notOlderThnaTwoWeeks(Zapytania zapytanie){
        if(zapytanie.data < 14)
            return true;
        else return false;
    }

    public static void wyswietlIfYoungerThanTwoWeeks(Zapytania zapytanie){
        if (zapytanie.notOlderThnaTwoWeeks(zapytanie))
            System.out.println(zapytanie);
    }

    public static void wyswietlListe(List<Zapytania> list){
        for(Zapytania zapytanie : list)
            if (zapytanie.notOlderThnaTwoWeeks(zapytanie))
                System.out.println(zapytanie);
    }

    @Override
    public String toString() {
        return "Zapytania{" +
                "uzytkownik=" + uzytkownik +
                ", data=" + data +
                '}';
    }
}
