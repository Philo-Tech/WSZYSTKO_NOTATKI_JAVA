package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.MAPY.Zad5;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] tab = {1,1,1,1,1,2,2,2,2,3,3,4,4,4,45,5,5,5};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : tab) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) +1); // map.get(i) +1  -> pobieramy starą wartość wystąpień
            }
            else {
                map.put(i,1);
            }
        }

        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            System.out.println(integerIntegerEntry.getKey() + " ma: " + integerIntegerEntry.getValue() + " wystąpień ");
        }

    }
}
