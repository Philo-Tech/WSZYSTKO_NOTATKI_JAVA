package com.company.JAVA10.Zadanie10_suma_Stringow;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj string: ");
        String s1 = scanner.nextLine().trim();
        System.out.println("Podaj string: ");
        String s2 = scanner.nextLine().trim();

        System.out.println(sumaStringow(s1,s2));

    }

    public static String sumaStringow(String s1, String s2){
        return s1.concat(s2);
    }
}
