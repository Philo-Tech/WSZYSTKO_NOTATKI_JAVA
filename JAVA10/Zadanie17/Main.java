package com.company.JAVA10.Zadanie17;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] tab = {};
        System.out.println(Arrays.toString(srodkowe(null)));
    }

    static int[] srodkowe (int[] tab){
        int[] nowa = {};

        if (tab != null && tab.length > 0) {
        nowa[0] = (tab.length/2) ;
        nowa[1] = (tab.length/2) + 1;

        } else {
            System.out.println("Podano nieprawidłową tablicę");
        }
        return nowa;
    }
}
