package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.KOLEKCJE2.Zad1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Oskar");
        names.add("Adam");
        names.add("Damian");

        names.remove("Damian");

        System.out.println(names.get(1));

        System.out.println();

        showMe(names);

        for (String name : names) {
            System.out.println(name);
        }

        boolean isAdam = names.contains("Adam");
        System.out.println(isAdam);

        /////////////////////////////
        List<Integer> ages = new LinkedList<>();

        ages.add(20);
        ages.add(15);
        ages.add(10);
        ages.add(24);
        ages.add(22);

        ages.forEach(System.out::println);
    }

    public static void showMe(List<String> someList){
        someList.forEach(System.out::println);
    }
}
