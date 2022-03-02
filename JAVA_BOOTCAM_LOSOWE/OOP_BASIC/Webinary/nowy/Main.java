package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.Webinary.nowy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");

        int number = scanner.nextInt();

        if (number > 5) {
            System.out.println("wieksza od 5");

        } else {
            System.out.println("mniejsza: ");
        }

        if (number % 3 == 0) {
            System.out.println("liczba podzielna przez 3");
        } else {
            System.out.println("niepodzielna przez 3");
        }

        // Skrócony   if
        System.out.println(number % 5 == 0 ? "liczba podzielna przez 5" : "liczba niepodzielna przez 5");
        boolean czyPodzielna = (number % 2 == 0 ? true : false);
        System.out.println(czyPodzielna);

    }
}
