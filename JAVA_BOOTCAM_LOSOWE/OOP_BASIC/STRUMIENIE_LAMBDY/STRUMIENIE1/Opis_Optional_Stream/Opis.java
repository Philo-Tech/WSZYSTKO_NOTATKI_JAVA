package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.STRUMIENIE_LAMBDY.STRUMIENIE1.Opis_Optional_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Opis {

    /*
    * Strumień możemy otworzyć na każdym ze zbiorów danych (mapy/ kolekcje/ tablice )
    * Żeby utowrzyć na Kolekcjach, to trzeba uruchomoć metodę ".stream()"
    * Metody, które mamy dostępne, dzielą się na operacje pośredniczące i operacje kończące (po konczących nie możemy wywołać żadnej innej metody).
    * Każda operacja pośrednicząca zwraca "stream" jako typ zwracany. Kończąca zwraca wynik, najczęściej w postaci "Optional"
    * Każdy Strumień musi mieć metodę kończaca (nie musi mieć żadnej pośredniczącej)
    *
    * Optional - klasa pomocnicza
    * Wzorzec projektowy Dekorator, który mówi, że wartość, która będzie się w nim znajdować, jest opcjonalna
    * Optional -> coś jakby Klasa osłonowa. Opakowujemy nią Obiekt, gdy nie wiemy co jest w środku. Najpierw sprawdzimy co mamy w środku, bo może być "NULL"
    * np. możemy sprawdzić, co jest w środku, metodą "isPresent"
    * Nie da sie utworzyc instancji Klasy Optional
    *
    * */

    public static void main(String[] args) {

        List<String> list = Arrays.asList("imie","drugie","Magda","Tomek","Romek","Tadek");

        String name = "jakieś imie";
        Optional<String> stringOptional = Optional.ofNullable(name);

        // żeby dostać się do wartości opakowanej przez Klasę Opcjonal, to muszę użyć metody "get"
        // orElse -> albo dostaniemy String, a jak nie to wypiszemy "brak imienia" (jak w środku jest imie, to wypisze imie, a jak jest NULL, to wypisze komunikat o braku imienia)
        System.out.println(stringOptional.orElse("Brak imienia"));

        // jeżeli wartość istnieje to wyświetl do konsoli za pomocą Lambda
        stringOptional.ifPresent(s-> System.out.println(s));

        // bez Lambd. Klasycznie
        if (stringOptional.isPresent()){ // sprawdzamy czy w Optionalu znajduje się String
            System.out.println(stringOptional.get()); // rozpakowujemy Optionala i dostajemy się do tego co jest w środku -> metoda "get()"
        } else {
            System.out.println("imie nie istnieje");
        }
    }

}
