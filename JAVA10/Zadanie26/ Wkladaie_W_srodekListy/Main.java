package com.company.JAVA10.Zadanie26;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new LinkedList<>();

        numbers.add(5);
        numbers.add(3);
        numbers.add(10);
        numbers.add(4);
        numbers.add(6);

        numbers.add(2, 99);

        for (int i: numbers) {
            System.out.println(i);
        }
    }
}
