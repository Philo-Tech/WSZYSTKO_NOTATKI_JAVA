package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.ADNOTACJE.Zad1;

// moja własna adnotacja z argumentem
@Doc(info = "Klasa reprezentująca człowieka")
public class Person {

    @Doc(info = "Pole reprezentujące wiek(zakres 0-99)")
    private int age;
    @Doc(info = "Pole reprezentujące imie")
    public String name;

    @Doc(info = "Konstruktor z dwoma argumentami")
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
