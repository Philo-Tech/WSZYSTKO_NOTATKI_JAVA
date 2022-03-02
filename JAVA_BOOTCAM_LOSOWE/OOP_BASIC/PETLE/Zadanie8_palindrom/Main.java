package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.PETLE.Zadanie8_palindrom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        boolean isPalindrom = true;
        boolean flag = true;
        for (int i = 0, j= string.length()-1; i < string.length(); i++, j--) {

            char c= string.charAt(i);
            char d = string.charAt(j);

            int counter = 0;
            while (j != 0 && counter <string.length()){
                if (c == d) flag = true;
                else flag = false;
                counter++;
            }
        }System.out.println(flag);

        // ######### Inne sposoby !!!

        if (string.equals(new StringBuilder(string).reverse().toString()))
            System.out.println("Palindrom");
        else System.out.println("nie palindrom");


        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != string.charAt(string.length()- 1 - i))
                isPalindrom = false;
        }
        if (isPalindrom) System.out.println("jest");
        else System.out.println("nie jest");
    }
}
