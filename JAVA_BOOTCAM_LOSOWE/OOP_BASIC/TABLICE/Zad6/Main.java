package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.TABLICE.Zad6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] a = new int[]{3,2};
        int[] b = new int[]{3,2};

        int[] dl1 = returnTabSum(a,b);
        int dl = dl1.length;

        for (int i = 0; i < dl-1; i++) {
            int[] nowa2 = returnTabSum(a,b);
            System.out.println(nowa2[i]);

        }
    }

    public static int[] returnTabSum(int[] tab, int[]tab1){
        int[] nowa = new int[tab.length + tab1.length];

        for (int i = 0; i < nowa.length-1; i++) {
            while (i < tab.length-1){
                nowa[i] = tab[i];
                break;
            }
            nowa[i] = tab1[i-tab.length];
        }
        return nowa;
    }
}
