package com.company.Zadanie1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("nowy");
        System.out.println(add(3,4));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pierwsza: ");
        int liczba1 = scanner.nextInt();
        System.out.println("Druga: ");
        int liczba2 = scanner.nextInt();

        System.out.println(add(liczba1, liczba2));

    }

    public static int add(int a, int b){
        return a + b;
    }
}
