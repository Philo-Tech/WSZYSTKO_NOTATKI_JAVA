package com.company.JAVA10.Zadanie_29_Enum;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("BMW", Color.BLACK);
        System.out.println(car.getColor().getColorCode());

    }

}
