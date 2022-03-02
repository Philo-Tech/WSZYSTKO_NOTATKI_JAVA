package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.STRING;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int a = 1;
        int b = 1;

        Integer c = new Integer(2);
        Integer d = new Integer(2);

        System.out.println(c.equals(d));


        String xxx = "Ala " + "ma " + "kota";

        // Java zamienia na coś takiego:
        StringBuilder yyy = new StringBuilder().append("Ala ").append("ma ").append("kota");

        long startTime = System.currentTimeMillis();
        StringBuilder xx = new StringBuilder();

        for (int i = 0; i < 100000; i++) {
            xx.append("hello"); // tak jest o wiele szybciej, bo jakby był plus, to Java musiałaby 100.000 razy zamienić "+" na StringBuilder, czyli stworzyć 100... Obiektów
        }

        long stopTime = System.currentTimeMillis();

        System.out.println("czas: " + (stopTime -startTime));

        System.out.println(xxx);
        System.out.println(yyy);

        System.out.println(xxx.substring(xxx.length()-2)); // tak jest optymalnie, bo ponieżej zamieniamy ciąg na konkatenację Stringa
        System.out.println("\ndwie ostatnie to: " + xxx.charAt(xxx.length()-2) + xxx.charAt(xxx.length()-1));// tutaj "+" oznacza konkatenację, ponieważ występuje String w tym wyrażeniu

        System.out.println(xxx.charAt(xxx.length()-2) + xxx.charAt(xxx.length()-1)); // w tym przypadku, czyli bez Stringa w wyrażeniu, kompilator przekonwertuje "charAt" na liczby kodu ASCII i doda je

        boolean bbb = xxx.contains("ma");
        boolean bb = xxx.contains("ala") || xxx.contains("Ala");
        System.out.println(bb);
        System.out.println(bbb);



    }
}
