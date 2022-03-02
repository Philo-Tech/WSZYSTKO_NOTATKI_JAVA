package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.INNER_CLASSES.VER_4_0_anonimowe_wew;

import java.util.ArrayList;
import java.util.List;

public class Main  {

    public static void main(String[] args) {
        List<String> persons = new ArrayList<>();

        for (String person : persons){  }

        persons.forEach(person -> System.out.println(person)); // za każdym razem "person" będzie dostępny, żeby coś z nim zrobić
        // tak samo jak w pętli "forech" wyżej
       persons.forEach(System.out::println); // argument domyślny

        persons.forEach(Main::getName);

    }
    public static String getName(String name){
        return name;
    }

    public void sayHeeloOne(){
        HelloService helloService = new HelloService() {
            @Override
            public void sayHello() {
                System.out.println("Hello 1"); // w ten sposób mozną różnie implementować interfejs funkcyjny
            }
        };
    }
    public void sayHelloTwo(){
        HelloService helloService = ()-> System.out.println("Hello 2"); // LAMBDA !!!
        }
    }

