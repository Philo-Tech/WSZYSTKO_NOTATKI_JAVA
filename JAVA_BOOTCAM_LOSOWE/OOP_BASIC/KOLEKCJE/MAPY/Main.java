package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.KOLEKCJE.MAPY;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("kot", "cat");
        dictionary.put("pies", "dog");
        dictionary.put("dom","house");

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine().trim();

        if (dictionary.containsKey(s1)) {
            System.out.println(dictionary.get(s1).substring(0,1).toUpperCase(Locale.ROOT) + "" + dictionary.get(s1).substring(1).toLowerCase());
        }
        else
            System.err.println("Słownik nie zawiera takiego wyrazu...");


        System.out.println("Podaj pierwsza liczbe: ");
        int a = scanner.nextInt();
        System.out.println("Druga: ");
        int b = scanner.nextInt();
        double score = (double) a/b;
        System.out.println(score);

        System.out.println(a%10);

        if (a%3 == 0 || a%5 == 0)
            System.out.println(a);
        else System.err.println("Liczba niepodzielna przez 3 ani 5");


    }
}
