package com.company.JAVA10.Zadanie15_dodawanie_tablic;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] tab = {1,2};
        int[] tab3 = {3,4};
        System.out.println(Arrays.toString(addTab(tab, tab3)));

    }

    public static int[] addTab(int[] tab1, int[] tab2){
        int[] nowa = new int[4];
        nowa[0] = tab1[0];
        nowa[1] = tab1[1];
        nowa[2] = tab2[0];
        nowa[3] = tab2[1];
        return nowa;
    }
}
