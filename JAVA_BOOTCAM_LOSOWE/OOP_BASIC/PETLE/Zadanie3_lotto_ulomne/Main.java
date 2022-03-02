package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.PETLE.Zadanie3_lotto_ulomne;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] tab = new int[6];
        int[] tab2 = new int[6];
        int number;


        for (int i = 0; i < 6; i++) {
            tab2[i] = (random.nextInt(49) +1);
        }

        int counter = 1;
        do{

            for (int i = 0; i < 6; i++) {

                System.out.println("Podaj " + counter + " liczbe: ");
                tab[i] = scanner.nextInt();
                counter++;

            }

        } while (counter != 7);


        if (lotto(tab, tab2)) System.out.println("Wgrałeś!!!");
        else System.out.println("peszek...");

    }

    public static boolean lotto(int[] a, int[] b){
        boolean flag = true;
        for (int i = 0; i < 6; i++) {
            if (a[i] == b[i]) {

                flag = true;}
            else flag = false;

        }
        return flag;
    }
}
