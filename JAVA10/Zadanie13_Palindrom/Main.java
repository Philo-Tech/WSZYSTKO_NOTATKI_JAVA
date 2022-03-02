package com.company.JAVA10.Zadanie13_Palindrom;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj palindrom: ");
        String s = scanner.next();
        System.out.println(czyPalindrom(s));

    }


    // ŻLE   !!!!!!!!!!!!!!!!!!! ciągle false
    public static boolean czyPalindrom (String s){

        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);



            for (int j = s.length()-1; j >= 0 ; j--) {
                char temp2 = s.charAt(j);
                if(temp2 != temp) return flag = false;
                else flag = true;


            }

        } return flag;
    }
}
