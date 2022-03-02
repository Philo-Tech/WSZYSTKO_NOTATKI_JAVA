package com.company.JAVA10.Zadanie_32_Daj_Glos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("small dog", "woof", false));
        animals.add(new Animal("big dog", "woof", true));
        animals.add(new Animal("cow", "moo", true));
        animals.add(new Animal("Frog", "croak", false));

        Random random = new Random();

        System.out.println("loud animals");
        for (Animal animal : animals){
            if (animal.isLoud()){
                System.out.println(animal.getName() + ":");
                animal.speak(random.nextInt(4) + 1);
            }
        }
        System.out.println("\nSilent animals");
        for (Animal animal : animals){
            if(!animal.isLoud()){
                System.out.println(animal.getName() + ":");
                animal.speak(random.nextInt(4) + 1);
            }
        }

    }

}
