package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.WYJATKI.Zad2;

public class Main {
    public static void main(String[] args) {
        // dwa wyjatki z jednego poziomu DRY

        try {
            String s = null;
            s.concat("test");
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.err.println("zrob coś");
            e.printStackTrace(); // wypisze stos wywołań, ale zwróci 0
        }

        System.out.println("program działą dalej"); // wypisze się ponieważ obsłużyliśmy wyjątek, więc nie wywali nam błędu
    }
}
