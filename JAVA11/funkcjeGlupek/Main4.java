package com.company.funkcjeGlupek;

import java.util.Scanner;

public class Main4 {

    static boolean isFemale(String name){
        if(name.endsWith("a")) return true;
        else return false;
    }

    static String readName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        return scanner.next();
        //String name = scanner.next();
        //return name;
    }

    public static void main(String[] args) {

        System.out.println(isFemale(readName()));
        String name = readName();
        if(isFemale(name)) System.out.println("Imie żeńskie: ");
        else System.out.println("Imie męskie: ");

    }
}
