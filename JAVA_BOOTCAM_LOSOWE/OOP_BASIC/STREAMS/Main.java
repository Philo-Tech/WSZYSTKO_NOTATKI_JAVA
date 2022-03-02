package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.STREAMS;

// Strumienie służą do przetwarzania danych
// Filtrowanie i praca danych (kolekcji)

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person(1,"Agata", 20, "User"),
                new Person(2,"magda", 12, "User"),
                new Person(3,"Tomek", 33, "User"),
                new Person(4,"Iza", 33,"User"),
                new Person(5,"ania", 18, "User"),
                new Person(6,"Bogusia", 17, "User"),
                new Person(7,"Adam", 88, "Admin")
        );

        // PRZYKLAD 1 ->  jak coś tak wygląda to jest -> ARROW ANTI-PATTERN
        for(Person person : persons){
            if (person.getAge()<30){
                if (person.getName().endsWith("a")){
                    if (person.getRole().equalsIgnoreCase("user")){
                        System.out.println(person );
                    }
                }
            }
        }
        System.out.println("\n\n");



        // PRZYKLAD 2 -> STRUMIENIE
        // Stream<Person> stream = persons.stream(); -> nie trzeba tego pisać
        persons.stream()
                .filter(person -> person.getAge() < 30)
                .filter(person -> person.getName().endsWith("a"))
                .filter(person -> person.getRole().equalsIgnoreCase("user"))
                .map(person -> setNameToUpperCase(person.getName())) // wykorzystuje metodę poniżej, która zwraca String, a w strumieniu mamy "person"// zwróci tylko imiona podnisione do wielkich liter
                // dzieki "map" wyciagnelismy tylko imiona z obiektów "person" // metoda determinuje co otrzymamy-> tutaj zwraca String
                .collect(Collectors.toList()) // to co zostało, zamieniłem na listę Stringów (w locie)
                .forEach(System.out::println);   // żeby zakońćzyć strumień/ splaszczyc go/ to samo co filter, ale teraz moge cos z tym zrobic

        }


    private static String setNameToUpperCase(String name){
        return name.toUpperCase();
    }


}
