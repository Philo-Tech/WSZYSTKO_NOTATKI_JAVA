package com.company.JAVA10.Zadanie20_sortowanie_Listy;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(2);

        System.out.println(list);
        System.out.println(posortowana(list));
    }

    static List<Integer> posortowana (List<Integer> list){
        Collections.sort(list); // zwraca void
        return list;
    }
}
