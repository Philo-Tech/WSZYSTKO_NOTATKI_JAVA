package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.PETLE.Zadanie6_liczbaPierwsza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 3; i < number; i++) {
            if ((number % i != 0) || (number == 2)) System.out.println("pierwsza");
            else System.out.println("druga");

        }

    }
}

