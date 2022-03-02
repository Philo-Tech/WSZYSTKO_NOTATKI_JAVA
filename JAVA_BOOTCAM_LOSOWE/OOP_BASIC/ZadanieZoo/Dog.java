package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.ZadanieZoo;

public class Dog extends Animal implements Canine{

    public Dog(String name, float weight) {
        super(name, weight);
    }
    // można implementować dowolną liczbę interfejsów

    @Override // metoda z Interfejsu
    public void bark() {
        System.out.println("bark bark bark");
    }

    @Override // metoda z klasy abstrakcyjnej Animal
    public void introduce() {
        System.out.println("Im a Dog. My name is "
                + this.name
                + ". I weight "
                + this.weight
                + "kg and my fur length is."
        );
    }
    // własna metoda Dog
    public void sitPrytty(){
        System.out.println(this.name + "sits pretty.");
    }

}
