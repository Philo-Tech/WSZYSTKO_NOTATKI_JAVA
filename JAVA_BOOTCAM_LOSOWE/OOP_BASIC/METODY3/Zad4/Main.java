package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.METODY3.Zad4;

public class Main {
    public static void main(String[] args) {

        howManyK("sdfdsfsdfskkksfsdafafs");
    }
    public static int howManyK(String s){
        char c = 'k';
        int counter=0;
        char[] tab = s.toCharArray();
        for (int i = 0; i < tab.length; i++) {
            if ( tab[i] == c ){
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }
}
