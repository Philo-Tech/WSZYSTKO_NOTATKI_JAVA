package com.company.JAVA10.Zadanie6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");

        int liczba = scanner.nextInt();

        if (liczba > 5) System.out.println("wieksza od 5");
        else if (liczba == 5) System.out.println("równa 5");
        else System.out.println("mniejsza od 5");

        Integer f = 5;
        Integer g = 6;
        boolean bb = f.equals(g);
        System.out.println("dwie liczby Integer " + bb);

    }
}
