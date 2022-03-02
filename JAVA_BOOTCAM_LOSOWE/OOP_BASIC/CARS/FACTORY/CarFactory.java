package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.CARS.FACTORY;

import com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.CARS.Car;

public class CarFactory {

    //Car car = new Car();
    //static Car car1 = new Car(4,3,1800,"Opel","Astra","Benzyna");

    public static Car getCar(){
        return new Car();
    }
    public void generateCar(){
        Car car = new Car();
        //car.wheels=4;
        //car.doors=5;

        System.out.println(car);
    }

    public void generateConstructorCar(){
        Car car = new Car(8,8,
                1.8,"Opel","Mokka","diesel");

        System.out.println(car);
    }
    public void generateMazdaCar(){
        Car car = new Car(7,7,3.0,
                "Mazda","77","elektro");
        car.setWheels(2);
        System.out.println(
                        car
                        + "\nPosiada liczbe kół: "
                        + car.getWheels()
                        +"\n Posiada drwzi: "
                        + car.getDoors()
                        +"\nmarki: "
                        +car.getBrand());
    }
}
