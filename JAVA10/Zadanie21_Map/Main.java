package com.company.JAVA10.Zadanie21_Map;


import java.util.*;

public class Main {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Podaj ile liczb: ");
       int n = scanner.nextInt();

       Map <Integer, Integer> numbers = new TreeMap<>();
       List<Integer> list = new ArrayList<>();

       int number; //
       for (int i = 0; i < n; i++){

           number = scanner.nextInt();
           list.add(number);

           if (numbers.containsKey(number)){
               numbers.put(number, numbers.get(number) + 1);

           } else {
               numbers.put(number, 1);
           }
       }

       for (Map.Entry<Integer, Integer> pair: numbers.entrySet()) {
           if (pair.getValue() == 1) {
               System.out.println(pair.getKey() + "występuje tylko raz");
           } else {
               System.out.println(pair.getKey() + "występuje " + pair.getValue() + "razy");
           }
       }

    }
}
