package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.STRUMIENIE_LAMBDY.ELEMENTY_LISTY;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntUnaryOperator;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(12);

        System.out.println(map(list, s -> s + 5));
    }

    public static  <T extends Number> List<Number> map(List<T> list, IntUnaryOperator operator){
        List<Number> newList = new ArrayList<>();
        for (T t : list) {
            newList.add(operator.applyAsInt((Integer) t)); // applyAsInt -> metoda z wbudowanego Interfejsu "IntUnaryOperator". Przyjmuje int i zwraca int

        }
        // list.forEach(s -> newList.add(operator.applyAsInt(s)));
        // od Java 8 na każdej Kolekcji mamy wbudowanego "forEach", który jest w stanie przyjać jako arhument Lambdę
        return newList;
    }
}
