package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.OOP1.Zad1;

import java.util.Objects;

public class Person {

    private int age;
    private String name;
    private int height;

    Person(int age, String name, int height){
        this.height = height;
        this.name = name;
        this.height = height;
    }

    // Overloading głównego konstruktora i wywołanie głównego konstruktora tej samej klasy
    Person(int age, String name){
        this(age,name,0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && height == person.height && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, height);
    }
}
