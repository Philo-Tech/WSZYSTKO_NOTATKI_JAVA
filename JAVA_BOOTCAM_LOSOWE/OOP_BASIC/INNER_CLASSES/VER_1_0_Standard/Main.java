package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.INNER_CLASSES.VER_1_0_Standard;

public class Main {

    public static void main(String[] args) {

        // inicjalizacja obiektu klasy zewnetrznej
        OuterClass outerClass = new OuterClass();

        // inicjalizacja obiektu klasy wewnetrznej poprzez konstruktor klasy wewnętrznej
        OuterClass.InnerClass inner1 = outerClass.new InnerClass();

        // inicjalizacja klasy wewnetrznej, za pomocą metody z klasy z zewnetrznej(zwraca Obiekt klasy wewnetrznej)
        OuterClass.InnerClass inner2 = outerClass.getInnerClass();

        // inicjalizacja Obiektu ostatniej klasy za pomocą konstruktora. Musimy przedostać się przez kązdy konstruktor
        OuterClass.InnerClass.SubInnerClass subInnerClass = outerClass.new InnerClass().new SubInnerClass();

        //OuterClass.InnerClass.SubInnerClass - cały typ

    }
}
