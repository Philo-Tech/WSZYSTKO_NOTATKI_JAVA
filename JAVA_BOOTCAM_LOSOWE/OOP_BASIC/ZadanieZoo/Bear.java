package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.ZadanieZoo;

public class Bear extends Animal{

    private int furLength;

    public Bear(String name, float weight, int furLength) {
        super(name, weight);
        this.furLength = furLength;
    }

    @Override
    public void introduce() {
        System.out.println("Im Bear. My name is "
                + this.name
                + ". I weight "
                + this.weight
                + "kg and my fur length is "
                + furLength + "."
        );
    }
    public int getFurLength(){
        return furLength;
    }
    public void setFurLength(int furLength){
        this.furLength = furLength;
    }
}
