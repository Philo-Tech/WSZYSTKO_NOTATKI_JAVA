package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.PETLE.Zadanie9_maleLitery_map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String word = "sdfsaffFFFadfDSFsdaFSfAdf";
        Map<Character, Integer> integerMap = new HashMap<>();

        int counter = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLowerCase(c))
                if (integerMap.containsKey(c)){
                    integerMap.put(c,integerMap.get(c) + 1);

                }else {
                    integerMap.put(c, 0);
                }
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : integerMap.entrySet()){
            System.out.println(characterIntegerEntry.getKey() + " " + characterIntegerEntry.getValue());
        }
        }
    }

