package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.TABLICE.Zad6a;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] tab = concatTables(new int[]{1,2,3,4}, new int[]{1, 2});

        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            System.out.print(Arrays.asList(tab[i]));
        }
    }

    public static int[] concatTables(int[] tab1, int[] tab2) {
        int[] tabResult = new int[tab1.length + tab2.length];

        for (int i = 0; i < tab1.length; i++) {
            tabResult[i] = tab1[i];
        }
        for (int i = tab1.length; i < tabResult.length; i++) {
            tabResult[i] = tab2[i - tab1.length];
        }
        for (int i = 0; i < tabResult.length; i++) {
            System.out.print(Arrays.asList(tabResult[i]));
        }
        return tabResult;
    }
}
