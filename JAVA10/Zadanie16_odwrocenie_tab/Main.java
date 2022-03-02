package com.company.JAVA10.Zadanie16_odwrocenie_tab;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] tab = {1,2,3};
        System.out.println(Arrays.toString(odwracanieTab(tab)));
    }

    static int[] odwracanieTab(int[] tab){
        int[] nowa = new int[tab.length];

        for (int i = tab.length -1, j = 0; i >= 0 ; i--, j++) {
            nowa[j] = tab[i];
        }
        return nowa;
    }

}
