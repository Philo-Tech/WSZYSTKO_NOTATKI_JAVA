package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.ENUM.Zad1;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Season season = Season.SUMMER;

        System.out.println(season.getAvgTemp());

        Season.valueOf("SUMMER").getAvgTemp(); // zmienia Stringa na wartość enuma, np. jak użytkowanik w pisze w konsolę SUMMER

        String s = "SUMMeR";
        System.out.println(Season.valueOf(s.toUpperCase(Locale.ROOT)).getAvgTemp());
    }
}
