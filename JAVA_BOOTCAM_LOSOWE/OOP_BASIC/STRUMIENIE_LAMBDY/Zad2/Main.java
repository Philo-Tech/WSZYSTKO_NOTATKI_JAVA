package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.STRUMIENIE_LAMBDY.Zad2;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // LAMBDA musi być (jawnie lub niejawnie) połączona z Interfejsem Funcyjnym. Bez tego nie będzie działać

        // Lambde ukladamy adekwatnie do tej metody fukcyjnej w interfejsie
        // Labda ściśle jest powiązana z metodą z Interfejsu Funkcyjnego. Nic nie możemy zmienić
        Nameator nameator = s -> s.toUpperCase(); // wstrzyknęliśmy ciało metody, czyli co ona ma robić i złapaliśmy ten nowy twór w "nameator"

        System.out.println(nameator.getName("oskar")); // wywołujemy metodę z interfejsu, ale już ze wstrzykniętym ciałem metody chwyconym w "nameator"

        // mamy jedną metodę, a możemy zaimplementować dowolne jej ciało
        Nameator nameator1 = s -> s.substring(1,3); // wstrzykujemy inną metodę

        // żeby skorzystać z ciała Lambdy, należy odpalić metodę, która znajduje się w Interfejsie Funkcyjnym
        System.out.println(nameator1.getName("jakiesImie"));


        showMe(s -> s.toLowerCase(Locale.ROOT), "HEJO!");
        showMe(s -> s.toUpperCase(), "z małych");
        showMe(s -> String.valueOf(s.charAt(0)), "coś");

        //lambda bez zapisu skróconego
        showMe((String s) -> {
            return String.valueOf(s.charAt(0));
        }, "hejo");


    }
    public static void showMe(Nameator nameator, String name){

        System.out.println(nameator.getName(name));
    }
}
