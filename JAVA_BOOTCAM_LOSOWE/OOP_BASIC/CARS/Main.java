package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.CARS;

import com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.CARS.FACTORY.CarFactory;

public class Main {


    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();
        carFactory.generateCar();
        carFactory.generateConstructorCar();
        carFactory.generateMazdaCar();

        //System.out.println("hello world\n" + CarFactory.getCar());
    }
}
