package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.POROWNYWANIE_OBIEKTOW.Zad1;

public class Person implements Comparable<Person> { // konieczne żeby zadziałało Collections.sort() wg naszego "wzoru" (czyli po name-> nadpisana metoda na dole)
    // porównywanie domyślne dla danego Obiektu -> klasa Comparable

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    /*@Override// metoda z klasy Comparable, sortowanie za pomocą int. Gdy zwróci "0" oznacza, że obietty są równe, -1 to Obiekt w góre, 1 to obiekt pójdzie w dół
    public int compareTo(Person o) {
        return name.compareTo(o.getName());// porównanie do "name" z Obiektu, który przyjdzie, czyli alfabetycznie po Stringach
    }*/

    // porównywanie na podstawie wieku
    /*@Override// metoda z klasy Comparable, sortowanie za pomocą int. Gdy zwróci "0" oznacza, że obietty są równe, -1 to Obiekt w góre, 1 to obiekt pójdzie w dół
    public int compareTo(Person o) {
        return age > o.getAge() ? 1 : -1;
    }*/

    // inna metoda -> Integer.compare(int x, int y) -> zwróci mnniejszą/ rosnąco
    /*@Override// metoda z klasy Comparable, sortowanie za pomocą int. Gdy zwróci "0" oznacza, że obietty są równe, -1 to Obiekt w góre, 1 to obiekt pójdzie w dół
    public int compareTo(Person o) {
        return Integer.compare(this.age,o.getAge());
    }*/

    // gdy imiona są takie same, to sortujemy/ porównujemy po wieku
    @Override// metoda z klasy Comparable, sortowanie za pomocą int. Gdy zwróci "0" oznacza, że obietty są równe, -1 to Obiekt w góre, 1 to obiekt pójdzie w dół
    public int compareTo(Person o) {
        if(name.equals(o.getName())){
            return Integer.compare(this.age,o.getAge());
        }else {
            return name.compareTo(o.getName());
        }
    }


}
