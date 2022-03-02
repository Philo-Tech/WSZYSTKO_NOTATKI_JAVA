package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.METODY3.Zad1;

public class Main {
    public static void main(String[] args) {

        System.out.println(longest(new String[]{"k","kkk","kk"}));
    }
    public static int longest(String[] tab){
        int longest=0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].length() > longest)
                longest=tab[i].length();
        }
        return longest;
    }
}
