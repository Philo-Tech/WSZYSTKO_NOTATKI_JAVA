package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.TABLICE.Zad8;

public class Main {
    public static void main(String[] args) {

        System.out.println(getBiggest(new int[]{2,5,7,2,10}));
    }

    public static int getBiggest(int[] tab){
        int temporary=0;
        for (int i = 0; i < tab.length; i++) {

            if (tab[i] > temporary)
                temporary=tab[i];
        }
        return temporary;
    }
}
