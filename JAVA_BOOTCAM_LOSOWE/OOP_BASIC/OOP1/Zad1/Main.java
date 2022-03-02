package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.OOP1.Zad1;



public class Main {
    public static void main(String[] args) {

        Person person = new Person(25,"Tomek");
        Person person1 = new Person(25,"Tomek");
        //System.out.println(person.getName());

        System.out.println(person.equals(person1));
    }
}
