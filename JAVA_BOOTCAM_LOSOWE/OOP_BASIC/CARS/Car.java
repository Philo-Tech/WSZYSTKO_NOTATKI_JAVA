package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.CARS;

public class Car {

    private int wheels;
    private int doors;
    double engineCapacity;
    String brand;
    String model;
    String fuel;

    public Car(){}

    public Car(int wheels, int doors, double engineCapacity, String brand, String model, String fuel){
        this.wheels = wheels;
        this.doors=doors;
        this.engineCapacity=engineCapacity;
        this.brand=brand;
        this.model=model;
        this.fuel=fuel;
    }

    public int getWheels(){
        return wheels;
    }
    public void setWheels(int wheels){
        if(wheels ==4)
            this.wheels=wheels;
        else System.out.println("nie mozna miec tyle opon");
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void getHorn(){
        System.out.println("beeeep");
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", doors=" + doors +
                ", engineCapacity=" + engineCapacity +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
