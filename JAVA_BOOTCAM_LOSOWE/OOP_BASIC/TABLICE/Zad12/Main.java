package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.TABLICE.Zad12;

public class Main {
    public static void main(String[] args) {

        String[] tab = {"cos", "12345","cos","12345"};
        fiveLetters(tab);

    }

    public static String[] fiveLetters(String[] tab){

        int counter = 0;
        String[] nowa = new String[tab.length];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].length() == 5) {
                nowa[counter] = tab[i];
                counter++;
            }
        }
        String[] names = new String[counter];

        for (int i = 0; i < names.length; i++) {
            names[i] = nowa[i];
        }
        for (String i: names) {
            System.out.print(i + " ");
        }
        return names;
    }
}
