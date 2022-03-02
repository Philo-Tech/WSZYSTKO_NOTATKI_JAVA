package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.STRUMIENIE_LAMBDY.STRUMIENIE1.Zad1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Opis {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("imie","drugie","Magda","Tomek","Romek","Tadek");

        System.out.println(list.stream()
                                .mapToInt(s-> s.length())
                                .max());

        System.out.println(list.stream()
                                .filter(s -> s.endsWith("a"))
                                .count());

        List<Character> characters = list.stream()
                        //.map(s -> new Person(s, (int)(Math.random()))
                        .map(s -> s.charAt(0))
                        .sorted() // sotujemy i mamy nowy strumień posortowany, na którym bawimy się dalej
                        .distinct() // wyrzucamy powtórzenia
                        .collect(Collectors.toList()); // tworzymy nową listę ze strumienia


        for (Character character : characters) {
            System.out.println(character);
        }

    }
}
