package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.ZadanieZoo;

public class Tiger extends Animal {

    private int clawLengt;

    public Tiger(String name, float weight, int clawLengt) {
        super(name, weight);
        this.clawLengt = clawLengt;
    }

    @Override
    public void introduce() {
        System.out.println("Im Tiger. My name is "
                + this.name
                + ". I weight "
                + this.weight
                + "kg and my fur length is."
        );
    }
}
