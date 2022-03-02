package com.company.Zadanie2;

import java.util.Scanner;

public class Zadanie2 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą" );
        int a = scanner.nextInt();
        System.out.println("Podaj drugą" );
        int b = scanner.nextInt();

        //System.out.println(substract(4,3));
       // int wynik = substract(6,4);

        if (a>=b) System.out.println(substract1(a,b));
        else System.out.println("-1");

    }

    static int substract1 (int a, int b){
        return a - b;
    }

}
