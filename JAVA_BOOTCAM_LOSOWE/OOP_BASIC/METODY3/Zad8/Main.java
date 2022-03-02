package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.METODY3.Zad8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        fiveShots(20);

    }

    public static int[] fiveShots(int shots) {
        Random random = new Random();
        int[] tab = new int[shots];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(6) + 1;
        }

        for (int i : tab) {
            System.out.print(i + "|");
        }
        return tab;
    }
}
