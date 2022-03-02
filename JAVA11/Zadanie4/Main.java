package com.company.Zadanie4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("pierwszy");

        String str1 = scanner.nextLine();
        System.out.println("drugi");
        String str2 = scanner.nextLine();

        System.out.println(zwrocWiekszy(str1, str2));

    }

    static String zwrocWiekszy(String str1, String str2){

        if(str1.length() > str2.length()) {
            System.out.println("dłuższy string to ");
            return str1;
        } else return str2;
    }
}
