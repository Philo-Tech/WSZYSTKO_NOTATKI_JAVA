package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.Webinary.Nowy3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą: ");
        int a = scanner.nextInt();
        System.out.println("podaj drugą: ");
        int b = scanner.nextInt();

        double average = (a+b)/2.0;

        System.out.println(String.format("%.3f", average));

        //###################################################

        System.out.println("podaj słowo: ");
        String s = scanner.next().trim();

        System.out.println(s.charAt(s.length()-2));

        System.out.println("podaj drugie: ");
        String  s2 = scanner.next();

        System.out.println(s.equals(s2));

        StringBuilder string3 = new StringBuilder(s2); // rzutowanie Stringa(s2) na StringBuilder
        System.out.println(string3.reverse());

        String builderToString = string3.toString(); // robienie Stringa ze StringBuilder



    }
}
