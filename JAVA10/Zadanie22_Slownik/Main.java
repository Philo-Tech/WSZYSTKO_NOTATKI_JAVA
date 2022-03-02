package com.company.JAVA10.Zadanie22_Slownik;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("coś","something");
        dictionary.put("pies", "dog");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj polskie słowo: ");
        String wordPL = scanner.nextLine();


        if (dictionary.containsKey(wordPL)){
            System.out.println("Tłumaczenie " + dictionary.get(wordPL));
        } else {
            System.out.println("słownik nie zawiera takiego słowa");
        }
    }
}
