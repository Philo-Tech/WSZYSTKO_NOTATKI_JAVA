package com.company.JAVA10.Zadanie12_Liczba_dzielnikow;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe...");
        int liczba1 = scanner.nextInt();

        int[] tab1 = new int[liczba1];

        int dz = dzielniki(tab1,liczba1);
        System.out.println(dz);

    }

    public static int dzielniki (int[] tab, int liczba){// nie potrzeba tablicy
        int iloscDzielnikow = 1;

        for (int i = 1; i < tab.length; i++) {
            tab[i] = i;
            if (liczba % tab[i] == 0) {
                iloscDzielnikow++;
            }
        }
        return iloscDzielnikow;
    }
}
