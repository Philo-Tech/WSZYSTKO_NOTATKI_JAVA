package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.TABLICE.Zad3;

public class Main {
    public static void main(String[] args) {

        int[] tab = {1,2,55};
        int result = returnLast(new int[]{1,2,3,234});

        System.out.println(returnLast(tab));
        System.out.println(result);

    }

    public static int returnLast(int[] tab){
        return tab[tab.length-1];
    }
}
