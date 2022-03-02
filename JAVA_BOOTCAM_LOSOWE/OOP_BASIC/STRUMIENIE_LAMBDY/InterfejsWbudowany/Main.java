package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.STRUMIENIE_LAMBDY.InterfejsWbudowany;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {


        // nie ma wbudowanych Interfejsów, które przyjmują typy proste, więc trzeba użyć takiego, który przujmuje typy generyczne

        showMe(s -> s.toUpperCase(), "hejo");

    }

    public static void showMe(Function<String, String> function, String name){
        System.out.println(function.apply(name)); // apply -> metoda z Interfejsu Function. Zwraca String
    }
}
