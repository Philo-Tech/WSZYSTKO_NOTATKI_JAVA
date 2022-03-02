package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.METODY3.Zad2;

public class Main {
    public static void main(String[] args) {

        getOnlyTrue(new boolean[]{false,true,false,true,false});

    }
    public static boolean[] getOnlyTrue(boolean[] tab){

        int counter=0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]==true)
                counter++;
        }
        boolean[] nowa = new boolean[counter];

        for (int i = 0; i < nowa.length; i++) {
            nowa[i] = true;
        }
        for (boolean b: nowa) {
            System.out.print(b + " ");
        }
        return nowa;
    }
}
