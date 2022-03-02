package com.company.JAVA10.Zadanie28_OOPZadanie6_.Zoo;

public abstract class Animal { // klasa abstrakcyjna; własności klasy oraz interfejsu
                                // można deklarować metody posiadające tylko deklarację, bez ciała

    private int id;
    protected String name;
    protected float weight;
    private static int COUNTER = 0;

    public Animal(){}
    public Animal(String name, float weight) {
        this.id = ++this.COUNTER;
        this.name = name;
        this.weight = weight;

    }
    public abstract void introduce();

    public int getId() {
        return id;
    }

   /* public void setId(int id) {   // kasuje ID, żeby nie można było podmienić -> można tylko pobrać
        this.id = id;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    /*public static int getCOUNTER() {
        return COUNTER;
    }

    public static void setCOUNTER(int COUNTER) {
        Animal.COUNTER = COUNTER;
    }*/
}
