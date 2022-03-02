package com.company.JAVA10.Zadanie28_OOPZadanie6_.Zoo;

public class Wolf extends Animal implements Canine{

    @Override
    public void bark() {
        System.out.println("Wooow Woow Woow");
    }

    @Override
    public void introduce() {
        System.out.println("Hallo... im Wolf");
    }
}
