package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.MAPY.Zad4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String wybor = scanner.nextLine();

        Map<String, String> dictionary = new HashMap<>();

        do{
            System.out.println("Menu: " + "\n"
                    + "1 - dodaj słowo pl" + "\n"
                    + "2 - dodaj słowo ang" + "\n"
                    + "0 - exit");
            System.out.println("co chcesz zrobic: ");

            switch (wybor){
                case "1":
            }



        } while (!wybor.equals("0"));
    }

    public static void addPL(String s, String s2){
        Map<String, String> map = new HashMap();
        map.put(s,s2);
    }
}
