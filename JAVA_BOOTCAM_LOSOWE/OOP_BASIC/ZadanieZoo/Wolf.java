package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.ZadanieZoo;

public class Wolf extends Animal implements Canine{

    private int fangLength;

    public Wolf(String name, float weight, int fangLength) {
        super(name, weight);
        this.fangLength = fangLength;
    }

    @Override
    public void bark() {
        System.out.println("BARK BARK BARK");
    }

    @Override
    public void introduce() {
        System.out.println("Im Wolf. My name is "
                + this.name
                + ". I weight "
                + this.weight
                + "kg and my fang length is"
                + fangLength + "."
        );
    }
}
