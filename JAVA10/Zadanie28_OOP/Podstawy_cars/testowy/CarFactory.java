package com.company.JAVA10.Zadanie28_OOP.Podstawy_cars.testowy;

import com.company.JAVA10.Zadanie28_OOP.Podstawy_cars.Car;

public class CarFactory {

    public void generateBMW(){
        Car car = new Car();
        //car.wheels = 4;
        car.getHorn();
        //car.engineCapacity = 1.9;
        //car.brand = "BMW";

        System.out.println(car);
    }

    public Car generateMercedes(){
        Car car = new Car(
                4,5,1.9,
                "Mercedes", "S Klasse","Benzin");

        return car;
    }

    public Car generateAudi(){
        Car car = new Car(
                4,5, 1.5,
                "Audi", "A7", "Benzin");
        car.setWheels(6);

        System.out.println(car.getBrand()
                + " posiada "
                + car.getWheels()
                + " kół");

        return car;
    }
}
