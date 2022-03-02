package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.TABLICE.Zad2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int podanaWielkosc;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        podanaWielkosc = scanner.nextInt();

        int[] flexible = createTab(new int[podanaWielkosc]);
        flexible[0] = 340;

        for (int i = 0; i < flexible.length; i++) {
            System.out.print(Arrays.asList(flexible[i]));
        }

        System.out.println();
        System.out.println(returnFirstElement(flexible));

    }

    public static int[] createTab(int[] tab) {

        return tab;
    }

    public static int returnFirstElement(int[] tab) {
        return tab[0];
    }
}
