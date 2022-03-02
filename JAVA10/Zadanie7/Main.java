package com.company.JAVA10.Zadanie7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");

        String word = scanner.next();
        boolean b = word.substring(word.length()-1).equalsIgnoreCase("m");

        System.out.println(b);



    }
}
