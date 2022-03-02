package com.company.funkcjeGlupek;

import java.util.Scanner;

public class Main5 {

    static String readName(){
        System.out.println("podaj imie: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void main(String[] args) {


        String name = readName();

        if(name.endsWith("a")) System.out.println("15% zniżki na zakupy! :)");

    }
}
