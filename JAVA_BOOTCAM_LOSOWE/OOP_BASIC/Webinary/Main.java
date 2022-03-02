package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.Webinary;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        char[] chars = word.toCharArray();


        for (int i=0;i< chars.length;i++){
            System.out.println(chars[i]);
        }

        System.out.print("Ostatnia: ");
        System.out.println(word.charAt(word.length()-1));
        System.out.println(word.charAt(0));

        String name = new String("jakiś string");// new String wymusza utworzenie miejsca w pamieci operyacyjnej dla kazej zmiennej (oleje StringPool). equals da TRUE, ale == zwróci FALSE
    }
}
