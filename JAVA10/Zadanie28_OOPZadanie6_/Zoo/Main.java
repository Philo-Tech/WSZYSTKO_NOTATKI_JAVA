package com.company.JAVA10.Zadanie28_OOPZadanie6_.Zoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Bear bear = new Bear("Yogi", 200, 4);
        Tiger tiger = new Tiger("tiger", 100 );
        Wolf wolf = new Wolf();
        Dog dog = new Dog("piesek ",30);

        List<Animal> animals = new ArrayList<>(Arrays.asList(bear,tiger,wolf,dog));
        // animals.addAll(Arrays.asList(bear,tiger,wolf,dog));

        for (Animal animal : animals){
            System.out.print(animal.getId() + " : ");
            animal.introduce();
        }

        List<Canine> canines = new ArrayList<>(Arrays.asList(wolf, dog));

        for(Canine canine: canines){
            if ((canine instanceof Animal)){
                Animal animal = (Animal) canine;
                System.out.println("My name is" + animal.getName() + "and I am barking");
            }
            canine.bark();

            if (canine instanceof Dog){
                Dog dog1 = (Dog) canine;
                dog1.sitPretty();
            }
        }
    }
}
