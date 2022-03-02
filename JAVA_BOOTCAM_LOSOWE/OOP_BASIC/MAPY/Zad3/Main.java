package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.MAPY.Zad3;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Integer> totoLotek = new HashSet<>();

        Random random = new Random();

        int counter = 0;
        while (totoLotek.size()<6){
            totoLotek.add(random.nextInt(49) + 1);
            counter++;
        }

        for (Integer integer : totoLotek) {
            System.out.println(integer);
        }
        System.out.println(counter);
    }
}
