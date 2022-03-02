package com.company.JAVA10.Zadanie8;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        String czyKod = scanner.nextLine();

        //char[] tab = czyKod.toCharArray();

        if(czyKod.length() == 6
                && czyKod.charAt(2) == '-'
                && Character.isDigit((czyKod.charAt(0)))
                && Character.isDigit((czyKod.charAt(1)))
                && Character.isDigit((czyKod.charAt(3)))
                && Character.isDigit((czyKod.charAt(4)))){

                System.out.println("To jest kod pocztowy! ");
        }
                else {
            System.out.println("To nie jest kod pocztowy! ");
        }
    }
}
