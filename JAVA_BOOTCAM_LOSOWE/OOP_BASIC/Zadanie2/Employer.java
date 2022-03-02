package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.Zadanie2;

public class Employer extends Osoba {

    private double salary;
    private int age;

    public Employer(){
    }

    private Employer(String imie, String nazwisko, String PESEL, double salary, int age) {
        super(imie, nazwisko, PESEL);
        this.salary=salary;
        this.age=age;
    }

    public Employer createNewEmpouer(String imie, String nazwisko, String PESEL, double salary, int age) {
        if(imie.length() >= 5 ){
            return new Employer(imie, nazwisko, PESEL, salary, age);
        } else {
            System.err.println("Podales zbyt krotkie imie oraz nazwisko");
        }
        return null;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalaryPerYear(Employer employer){
        double salaryPerYear = employer.salary*12;
        System.out.println("Roczna pensja: " + employer.getImie() + " wynosi: " + salaryPerYear);
        return salaryPerYear;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "salary=" + salary +
                ", age=" + age +
                '}';
    }
}
