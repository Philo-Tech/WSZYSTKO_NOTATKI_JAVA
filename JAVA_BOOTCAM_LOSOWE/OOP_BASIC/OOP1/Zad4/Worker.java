package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.OOP1.Zad4;

public class Worker {

    private double salary;

    public Worker(){}

    public Worker(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "salary=" + salary +
                '}';
    }
}
