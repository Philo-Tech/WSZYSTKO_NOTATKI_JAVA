package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.Webinary.Nowy2;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        if(word.equals("Akademia")){
            System.out.println("Podałeś poprawne hasło: ");
        }
        else {
            System.out.println("Podałeś niepoprawne hasło: ");
        }

        boolean isTrue = (word.equals("cos") ? true : false);

        if (isTrue){
            System.out.println("tak");
        }else {
            System.out.println("nie");
        }

        long number = 12_342_764_723_647_364L;
        System.out.println(number);

        Random random = new Random();
        int range = 100;


        System.out.println(random.nextInt(range)+1);



    }
}
