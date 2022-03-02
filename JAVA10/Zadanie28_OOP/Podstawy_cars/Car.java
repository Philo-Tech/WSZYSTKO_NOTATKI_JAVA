package com.company.JAVA10.Zadanie28_OOP.Podstawy_cars;

public class Car {

    private int wheels;
    private int doors;
    private double engineCapacity;
    private String brand;
    private String model;
    private String fuel;


    public Car (){}
    public Car (int wheels, int doors, double engineCapacity, String brand, String model, String fuel){

        this.wheels = wheels;
        this.doors = doors;
        this.engineCapacity = engineCapacity;
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }
    public int getWheels(){
        return this.wheels;
    }

    public void setWheels(int wheels){
        this.wheels = wheels;
    }
    public String getBrand(){
        return this.brand;
    }

    public void getHorn (){
        System.out.println("Biiiiii");
    }

    @Override
    public String toString() {
        return "Car {" +
                " wheels=" + wheels +
                ", doors=" + doors +
                ", engineCapacity=" + engineCapacity +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
