package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.METODY3.Zad6;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPesel("83881151986"));

    }

    public static boolean isPesel(String s) {

        int counter = 0;
        boolean flag = true;
        char[] tab = s.toCharArray();

        for (int i = 0; i < tab.length; i++) {
            if (tab.length == 11) {
                if (Character.isDigit(tab[i])) counter++;
            }
        }
        if (counter ==11) return true;
        else return false;
    }
}
