package com.company.JAVA10.Zadanie19_Kolekcje_Array_List;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> elements = new ArrayList<>();
        elements.add(10);
        elements.add(6);
        elements.add(7);
        elements.add(8);
        elements.add(9);
        elements.add(3);

        // podzielnePrzezTrzy(elements);

        for (Integer i : podzielnePrzezTrzy(elements)){
            System.out.println(i);
        }
    }

    static List<Integer> podzielnePrzezTrzy (List<Integer> numbers){
        List<Integer> list = new ArrayList<>();

        for (Integer value : numbers){
            if (value % 3 == 0){
                list.add(value);
            }
        } return list;
    }
}
