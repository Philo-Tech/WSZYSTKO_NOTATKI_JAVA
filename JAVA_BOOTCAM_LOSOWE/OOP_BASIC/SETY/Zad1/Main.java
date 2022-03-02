package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.SETY.Zad1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Sety trzymają niepowtarzalne elementy
        // nie trzymaja kolejnosci dodawania
        // dzialaja szybciej niż listy
        // nie maja indeksów, czyli nie mozna odwołać się do indeksu
        // usuwac można tylko po obiekcie
        // działają na podstawie HashMap

        // najpierw uruchamia metode hashCode i go wylicza. Jeżeli będzie taki sam, to dopiero wtedy jest uruchamiana metoda equals(),
        // która porównuje wszystkie pola do siebie. Jeżeli hashCode jest inny to napewno Obiekty są różne

        Set<String> stringSet = new HashSet<>();

        stringSet.add("Oskar");
        stringSet.add("Oskar");
        stringSet.add("Oskar");
        stringSet.add("cos");
        stringSet.add("inne");

        stringSet.forEach(System.out::println);

        Set<Person> people = new HashSet<>();


    }
}
