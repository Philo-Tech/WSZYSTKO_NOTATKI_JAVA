package com.company.funkcjeGlupek;

import java.util.Scanner;

public class Main3 {

    static int add(int a, int b){

        return a+b;
    }

    static int substract(int a, int b){
        return a -b;
    }

    static int multiply(int a, int b){
        return a*b;
    }

    static float divide(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int firstNumebr =scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int secondNumebr = scanner.nextInt();


        System.out.println(add(firstNumebr,secondNumebr));
        System.out.println(substract(3,2));
        System.out.println(multiply(3,5));
        System.out.println(divide(8,2));

    }
}
