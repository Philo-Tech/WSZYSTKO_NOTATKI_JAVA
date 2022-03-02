package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.MAPY.Zad1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    // Mapy nie są kolekcjami, ponieważ mają odrębną hierarchię dziedziczenia
    // Kolekcje mają odziedziczyny Interfejs Collection, a Mapy nie mają


    // jak podamy ten sam klucz, to wartość zostanie nadpisana

    // od wersji 1.7 jeżeli Map-a jest duża to do porównywania wykorzystuje Interfejs CompareTo zamiast HashCode()
    public static void main(String[] args) {


        Map<String, String> tasks = new HashMap<>();
        tasks.put("10", "Zrób coś tam");
        tasks.put("12", "Zrób jeszcze coś");
        tasks.put("15","i na dokłądkę");

        // keySet() -> zwraca "set-a" kluczy. 
        for (String s : tasks.keySet()) {
            System.out.println(s);
        }

        // values() -> zwraca kolekcję wartości (czyli jest typu Iterable)
        for (String value : tasks.values()) {

            System.out.println(value);
        }

        // entrySet() -> zwraca klucz i wartość
        for (Map.Entry<String, String> stringStringEntry : tasks.entrySet()) {
            System.out.println(stringStringEntry);
        }

    }
}
