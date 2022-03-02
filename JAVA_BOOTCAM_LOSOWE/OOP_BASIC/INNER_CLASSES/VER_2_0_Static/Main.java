package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.INNER_CLASSES.VER_2_0_Static;

public class Main {

    public static void main(String[] args) {

        Outerclass outerclass = new Outerclass();

        // tworzenie obiektu klasy wewnetrznej za pomocą metody w klasie zewnetrznej
        Outerclass.InnerStaticClass innerStaticClass = outerclass.getInnerStaticClass();

        //tworzenie obiektu klasy wewnetrznej za pomocą konstruktora klasy zewnetrznej, przywołując od razu statyczną klasę wew. po kropce
        Outerclass.InnerStaticClass innerStaticClass1 = new Outerclass.InnerStaticClass();

        innerStaticClass1.nameInner = "imie wewnetrzne";// statyczna klasa wewnetrzna widzi tylko swoje pola wewnetrzne
        outerclass.nameOuter = "imie wewntrzne"; // klasa zewnetrzna tez widzi tyko swoje pola
    }

}
