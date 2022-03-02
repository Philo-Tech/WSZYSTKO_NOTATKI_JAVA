package com.company.JAVA10.Zadanie11_zwraca_dluzszy_String;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj 1: ");
        String s1 = scanner.nextLine();
        System.out.println("podaj 2: ");
        String s2 = scanner.nextLine();

        int longer = getLongerString(s1,s2);

        System.out.println(longer);

    }

    public static int getLongerString(String s1, String s2){

        return Math.max(s1.length(), s2.length());
    }
}
