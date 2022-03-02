package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.POROWNYWANIE_OBIEKTOW.Zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Ktoś", 30);
        Person person1 = new Person("Ktoś3", 20);
        Person person2 = new Person("Ktoś4", 35);
        Person person3 = new Person("Ktoś2", 32);

        List<Person> list = new ArrayList<>();
        list.add(person);
        list.add(person1);
        list.add(person2);
        list.add(person3);

        // listy nie maja sortowania domyślnego, dlatego używamy klasy Collections

        //Collections.sort(list);
        Collections.sort(list, new AgeSort()); //można też przez -> new ComparableTest().new AgeSort()   gdyby klasa AgeSort nie byłą statyczna

        for (Person person4 : list) {
            System.out.println(person4.getName() + " " + person4.getAge()); // w zależności, której nadpisanej metody użyjemy (w klasie Person), lub trzecia metoda
        }
    }

    // Klasa wewnetrzna z Comparator ( jest przystosowany do isteninia w klasie wewnetrznej)
    public static class AgeSort implements Comparator<Person> { // klasa musi być statyczna, żeby jej użyć (można też przez -> new ComparableTest().new AgeSort())

        @Override
        public int compare(Person o1, Person o2) {
            return Integer.compare(o1.getAge(), o2.getAge() * -1);
        }
    }

    public static class nameSort implements Comparator<Person> { // klasa musi być statyczna, żeby jej użyć (można też przez -> new ComparableTest().new AgeSort())

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName()) * -1;
        }
    }

}
