package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.TABLICE.Zad13;

public class Main {
    public static void main(String[] args) {

        makeLoweCase(new String[]{"DOMEK","COS","KKK"});
    }
    public static String[] makeLoweCase(String[] tab){
        String[] small = new String[tab.length];

        for (int i = 0; i < tab.length; i++) {
            small[i] = tab[i].toLowerCase();
        }
        for (String s: small) {
            System.out.println(s + " ");
        }
        return small;
    }
}
