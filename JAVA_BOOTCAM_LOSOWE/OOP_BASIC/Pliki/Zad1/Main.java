package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.Pliki.Zad1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile(null);


        try {
            System.out.println(readFile.countHRefOnWebsite("http://oskarpolak.pl"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
