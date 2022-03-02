package com.company.JAVA10.Zadanie5;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        String string1 = "Programowanie jest super";

        String[] s = string1.split(" ");

        for (int i = s.length-1; i >= 0; i--) {
            System.out.println(s[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie: ");

        String imie = scanner.nextLine();
        System.out.println(imie.length());

        String imie2 = imie.toUpperCase();

        String nowe = imie.replace(imie.charAt(0), imie2.charAt(0));
        System.out.println(nowe);

        System.out.println("Podaj wyraz");
        String g = scanner.nextLine();
        String g2 = new String("Programowanie");

        boolean czy = g.equals(g2);

        if(czy){
            System.out.println("Wpisałeś  " + g);
        }else System.out.println("Co Ty baranie wypiszujesz? Jakia " + g + " ?");

        System.out.println("Podaj imie po raz drugi: ");
        String pierwszaW = scanner.nextLine();
        if(pierwszaW.startsWith("w") || pierwszaW.startsWith("W")) System.out.println("Pierwsza to W");
        else System.out.println("Pierwsza nie jest W, tylko " + pierwszaW.substring(0,1));


    }
}
