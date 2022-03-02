package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.PETLE.Zadanie1;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) { // i<10 jest wydajniejsze od i<=9
            System.out.println(i++);
        }

        int a = 5;
        while (a < 10){

            System.out.println("A wynosi: " +a);
            a++;
        }


        //wykona się przynajmniej raz, nawet jak warunek nie będzie spełniony

        int k = 5;
        do {

            System.out.println("k wynosi: " + k);
            k++;

        } while (k < 10);

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int suma = 0;

        for (int i = 0; i <= n; i++) {

            System.out.println("i wynosi: " + i + "   suma: " + (suma +=i));
        }
        System.out.println(suma);

        // BigInteger - nieograniczona dokładność
        BigInteger bigInteger = new BigInteger("5");
        BigInteger second = new BigInteger("122");
        System.out.println();


    }
}
