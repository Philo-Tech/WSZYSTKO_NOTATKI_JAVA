package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.TABLICE.Zad4;

public class Main {
    public static void main(String[] args) {

        System.out.println(returnSum(new int[] {2,2}));
        System.out.println(returnSum(new int[]{1,2,3}));

        System.out.println(returnSumFirstLast(new int[]{1,2,3,4,5}));
    }

    public static int returnSum(int[] tab){
        if (tab.length == 2)
            return tab[0] + tab[1];
        else return -1;
    }

    public static int returnSumFirstLast(int[] tab){
        return tab[0] + tab[tab.length-1];
    }
}
