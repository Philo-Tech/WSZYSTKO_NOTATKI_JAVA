package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.TABLICE.Zad9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] tab= reverseTable(new int[]{1,2,3});

        for (int i = 0; i < tab.length; i++) {
            System.out.print(Arrays.asList(tab[i]));
        }

    }
    public static int[] reverseTable(int[] tab){
        int[] result = new int[tab.length];
        for (int i = tab.length-1, j=0; i >=0 ; i--,j++) {

            result[j] = tab[i];
        }
        return result;
    }

}
