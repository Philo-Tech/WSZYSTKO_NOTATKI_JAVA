package com.company.JAVA10.Zadanie27_zamianaElementow;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> nowa = new LinkedList<>();
        nowa.add(22);
        nowa.add(1);
        nowa.add(99);
        nowa.add(1);
        nowa.add(1);
        nowa.add(1);


            int a = nowa.get(0);
            nowa.remove(0);
            int b = nowa.get(2 -1);
            nowa.remove(2 -1);
            nowa.add(0,b);
            nowa.add(2,a);


        for (Integer i : nowa){
            System.out.println(i);
        }

    }
}
