package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.WYJATKI.Zad4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // IOException rzucone wewnątrz metody
        // wyjątki powinny być rzucane na jak najniższej warstwie logiki

        try {
            divide(7,0);
        } catch (IOException e) {
            System.err.println("nie wolno dzielić przez zero!");
        }
    }

    public static int divide(int a, int b) throws IOException { // oznaczamy, że metoda może rzucić wyjątek
        if (b == 0){
            throw new IOException("Do not divide by 0");
        }
        return a / b;
    }
}
