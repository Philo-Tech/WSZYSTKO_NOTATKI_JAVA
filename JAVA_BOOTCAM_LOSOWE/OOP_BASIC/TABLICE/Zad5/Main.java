package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.TABLICE.Zad5;

public class Main {
    public static void main(String[] args) {

        System.out.println(getMiddleElement(new int[] {1,2,3,4,5}));

    }

    public static int getMiddleElement(int[] tab){
      return tab[(tab.length/2)];
    }
}
