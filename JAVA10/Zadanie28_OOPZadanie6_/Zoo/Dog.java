package com.company.JAVA10.Zadanie28_OOPZadanie6_.Zoo;

public class Dog extends Animal implements Canine{



    public Dog(String name, float weight) {
        super(name, weight);
    }



    @Override // metoda z Animal
    public void bark() {
        System.out.println("bark bark bark");
    }

    @Override  // metoda Z Canine
    public void introduce() {
        System.out.println(
                "I'm dog,"
                        + this.name
                        + " is my name...whats up?"
                        + ". I weight: "
                        + this.weight
                        + " kg and my fur length is ");
    }

    public void sitPretty(){
        System.out.println(this.name + "sits pretty...");
    }
}
