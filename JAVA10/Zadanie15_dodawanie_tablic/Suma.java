package com.company.JAVA10.Zadanie15_dodawanie_tablic;

public class Suma {

    public static void main(String[] args) {

        System.out.println(sumaOstPierwszego(new int[]{1,2,5}));

    }
    public static int sumaOstPierwszego(int[] tab){
        int a =  (tab[tab.length-1]) + tab[0];
        return a;

    }


}
