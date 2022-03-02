package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.ZadanieZoo;

public interface Canine {

    public static final String NAME = "Lukasz"; // jezeli w interfejsie deklarujemy jakąś zmienną, to ZAWSZE wielkimi literami
    // domyślnie zmienne są "public static final"

    public void bark(); // wszystkie metody w interfejsie są publiczne
                        // w Interfejsie nawet nie można wpisać ciała metody
                        // w Java 8 wprowadzono interfejsowe klasy domyślne-> wtedy można wpisać ciało metody-> 'default void bark(){ sout("bark");}"
                        // interface może TYLKO rozszerzać inny interface, ale nie może implementować
                        // interface może rozszerzać (extends) inny interface
                        // nie może implementować(implements) innego intefejsu
}
