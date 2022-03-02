package com.company.JAVA10.Zadanie28_OOPZadanie6_.Zoo;

public class Tiger extends Animal{

    public Tiger() {
    }

    public Tiger(String name, float weight) {
        super(name, weight);

    }

    @Override
    public void introduce() {
        System.out.println("Tiger{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}');
    }


}
