package com.company.JAVA10.Zadanie15_dodawanie_tablic;

public class Sumea_elem_tab {

    public static void main(String[] args) {

        int[] tab6 = {1,2,3};
        System.out.println(sumeElemTab(tab6));
        //System.out.println(tab[2]);

    }

    static int sumeElemTab(int[] tab5){
        int suma = 0;
        for (int i = 0; i < tab5.length; i++) {
            suma = suma + tab5[i];
        }
        return suma;
    }
}
