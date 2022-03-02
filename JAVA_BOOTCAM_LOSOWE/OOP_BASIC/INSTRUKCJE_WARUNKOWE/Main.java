package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.INSTRUKCJE_WARUNKOWE;

public class Main {
    public static void main(String[] args) {

        int age = 17;
        String message = age>=18? "To ok" : "Za młody. Wypad"; // skrócony "if" musi być gdzieś przekzany; np. do metody


        System.out.println(message);

        switch (age){
            case 23:{
                System.out.println("masz 23 lata");
                break;
            }
            case 18:{
                System.out.println("masz 18 lat");
                break;
            }
            // gdy żaden "case" nie wystąpi
                //default jest opcjonalny
            default: {
                System.out.println("Nie ma info w systemie o takim wieku!");
            }
        }
    }
}
