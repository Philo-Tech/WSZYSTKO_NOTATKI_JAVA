package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.WYRAZENIA_REGULARNE.Zadanie1;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("imie:  "+Pattern.matches("[A-Z][a-z]+","Marcin"));

        // zakres polskich liter   [A-ZŻŹLĄćĘ][a-zżźęćąę]

        System.out.println("Kod pocztowy:  " +Pattern.matches("[0-9]{2}-[0-9]{3}","50-354"));
        System.out.println("Kod pocztowy:  " +Pattern.matches("\\d{2}-\\d{3}","50-354"));


        System.out.println("email:  " +Pattern.matches("[a-zA-Z]{3,20}@[a-zA-Z]{2,10}.pl","email@onet.pl"));
    }
}
