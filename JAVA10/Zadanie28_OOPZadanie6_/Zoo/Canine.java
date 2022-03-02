package com.company.JAVA10.Zadanie28_OOPZadanie6_.Zoo;

public interface Canine {

    // może rozszerzać inny interfejs -> extends
    // nie może implementować innego interfejsu -> implements
    // Interfejs posiada słówko kluczowe default, które pozwala na utworzenie metody z ciałem (od JAVA 8)

    String NAME = "imie";  // Wszystkie zmienne w Interfejsie, są domyślnie -> public static final, zawsze wielkimi literami

    void bark(); // wszystkie metody są domyślnie publiczne, nie mogą być inne i nie posiadają ciała



}
