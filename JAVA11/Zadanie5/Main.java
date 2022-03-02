package com.company.Zadanie5;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe: ");
        int a = scanner.nextInt();

        System.out.println(liczbaDzielnikow(a));

        manyWords("Tomek", "Wojtek", "Czesio");
        String[] abc = new String[]{"Lukasz", "Tomek", "Ktoś", "coś"};
        manyWords(abc);

        manyWords2(new String[]{"Lukasz", "Tomek", "Monika", "Pamela"});

    }
    //########################################################

    static int liczbaDzielnikow(int a){
        int suma = 1;
        for (int i = 1; i<a; i++){

            if (a % i == 0){
                suma++;
            }
        }
        return suma;
    }

    //-----------------------------------------------------

    public static void manyWords (String... args){ // przyjmuje nieskończenie wiele argumentów/ w ciele metody będą tablicą

    }

    public static void manyWords2(String[] args){// przyjmuje tablicę

    }

    public static String skomplikowanaMetoda(Integer waznaLiczba) throws IOException, Exception {

        return null; //wszystko co nie będzie liczbą, a Stringiem, zwróci null
    }
}
