package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.PETLE.Zadanie5_wiezyczka;

public class Main {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 5; i++) {
                stringBuilder.append("*");
                System.out.println(stringBuilder.toString());
        }

        System.out.println();
        StringBuilder stringBuilder2 = new StringBuilder("*");
        for (int i = 1; i <5 ; i++) {

            stringBuilder2.append("*");
            System.out.println(stringBuilder2.toString());

        }
    }
}
