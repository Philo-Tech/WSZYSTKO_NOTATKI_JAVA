package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.ZadanieZoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bear yogi = new Bear("Yogi",200,4);
        Tiger krolLew = new Tiger("Król Lew",120, 8);
        Wolf wilk = new Wolf("Aron", 70,6);
        Dog dog = new Dog("scooby",30);

        List<Animal> animalList = new ArrayList<>();
        animalList.addAll(Arrays.asList(yogi,krolLew,wilk,dog));

        for (Animal animal: animalList){
            System.out.print(animal.getId() + " : ");
            animal.introduce();
        }

        List<Canine> canines = new ArrayList<>(Arrays.asList(wilk,dog));

        for (Canine canine : canines){
            if(canine instanceof Animal){
                Animal animal = (Animal) canine; // rzutowanie na Animal daje dostęp do metod z Animal
                System.out.println("My name is " + animal.getName() + " and I am barking ");
            }
            canine.bark();

            if (canine instanceof Dog){
                Dog dogy = (Dog) canine;
                dogy.sitPrytty();
            }
        }
    }
}
