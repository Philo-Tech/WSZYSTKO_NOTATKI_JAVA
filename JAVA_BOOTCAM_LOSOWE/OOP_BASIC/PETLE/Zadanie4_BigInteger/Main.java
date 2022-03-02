package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.PETLE.Zadanie4_BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Podaj n ");

        if (n==1){
            System.out.println("Silnia: 1");
        }

        BigInteger sum = new BigInteger("1");
        for (int i = 0; i <= n; i++) {
            sum = sum.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println("Silnia: " + sum);


    }
}
