package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.ZAPYTANIE;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Zapytania> list = new ArrayList<>();

        Zapytania zapytanie = new Zapytania(new Uzytkownik("jakid","rrr@rrr"),15);
        Zapytania zapytanie2 = new Zapytania(new Uzytkownik("jakid  2 ","rrr@rrr"),10);
        Zapytania zapytanie3 = new Zapytania(new Uzytkownik("jakid  3 ","rrr@rrr"),10);
        Zapytania zapytanie4 = new Zapytania(new Uzytkownik("jakid","rrr@rrr"),15);

        list.add(zapytanie);
        list.add(zapytanie2);
        list.add(zapytanie3);
        list.add(zapytanie4);

        Zapytania.wyswietlListe(list);
    }
}
