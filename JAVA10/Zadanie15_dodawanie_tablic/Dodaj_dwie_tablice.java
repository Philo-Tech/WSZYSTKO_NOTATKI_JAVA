package com.company.JAVA10.Zadanie15_dodawanie_tablic;

import java.util.Arrays;

public class Dodaj_dwie_tablice {

    public static void main(String[] args) {

        int[] tab =  {1,2,3};
        int[] tab2 = {4,5,6};

        System.out.println(Arrays.toString(plusTwoArr(tab, tab2)));
    }

    public static int[] plusTwoArr(int[] tab, int[] tab2){

        int[] nowa = new int[tab.length + tab2.length];

        for (int i = 0; i < tab.length; i++) {
            nowa[i] = tab[i];
        }

        for (int j = tab.length ; j < nowa.length ; j++) {
            nowa [j] = tab2 [j - tab.length];
        }
        return nowa;
    }

}
