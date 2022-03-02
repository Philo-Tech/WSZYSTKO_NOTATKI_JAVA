package com.company.JAVA10.Zadanie28_OOPZadanie6_.Zoo;

public class Bear extends Animal {

    private int furLength;

    public Bear(String name, float weight, int furLength) {
        super(name, weight);

        this.furLength = furLength;
    }

    @Override
    public void introduce() {
        System.out.println(
                "I'm Bear,"
                + this.name
                + " Bear...whats up?"
                + ". I weight: "
                + this.weight
                + " kg and my fur length is "
                + this.furLength
                + ".");
    }

    public int getFurLength() {
        return furLength;
    }

    public void setFurLength(int furLength) {
        this.furLength = furLength;
    }
}
