package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.PETLE.Zadanie2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int secretNumber = 20;
        int myNumber = 0;

        do {
            System.out.println("Podaj liczbę: ");
            myNumber = scanner.nextInt();

            if (myNumber > secretNumber) System.out.println("za duża! ");
            else if(myNumber < secretNumber) System.out.println("za mała! ");

        } while (myNumber != secretNumber);
        System.out.println("Brawo! ");
    }
}
