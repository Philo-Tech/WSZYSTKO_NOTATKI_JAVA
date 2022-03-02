package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.TABLICE.Zad7;

public class Main {
    public static void main(String[] args) {

        System.out.println(getTablesSum(new int[]{1,2,3}));
    }

    public static int getTablesSum(int[] tab){
        int sum=0;
        for (int i = 0; i < tab.length; i++) {
            sum +=tab[i];
        }
        return sum;
    }
}
