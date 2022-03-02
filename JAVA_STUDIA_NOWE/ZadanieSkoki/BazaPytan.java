package com.company.JAVA_STUDIA_NOWE.ZadanieSkoki;

import java.util.Scanner;

public class BazaPytan {

    private static Scanner scanner = new Scanner(System.in);


    public static float silaWiatru(){
        float silaWiatru =0;
        System.out.println("Siła wiatru: ");
        return silaWiatru = scanner.nextFloat();
    }

    public static int jakiWiatr() {

        int jakiWiatr = 0;
        System.out.println("jaki wiatr? w plecy: 1, pod narty: 2, brak wiatru:0");
        return  jakiWiatr = scanner.nextInt();
    }
}
