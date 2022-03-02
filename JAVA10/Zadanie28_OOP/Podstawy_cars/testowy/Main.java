package com.company.JAVA10.Zadanie28_OOP;

import com.company.JAVA10.Zadanie28_OOP.Podstawy_cars.Car;
import com.company.JAVA10.Zadanie28_OOP.Podstawy_cars.testowy.CarFactory;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        //car.brand = "Mercedes";
        //car.getHorn();

        CarFactory carFactory = new CarFactory();
        carFactory.generateBMW();
        System.out.println(carFactory.generateAudi());
        System.out.println(carFactory.generateMercedes());
    }
}