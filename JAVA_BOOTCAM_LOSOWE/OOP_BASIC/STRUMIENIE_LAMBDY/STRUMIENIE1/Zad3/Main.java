package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.STRUMIENIE_LAMBDY.STRUMIENIE1.Zad3;

import java.util.Objects;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        IntStream.range(0,100)
                .filter(s -> s % 2 == 0)
                //.mapToObj(s-> String.valueOf("Imie " + s))
                .mapToObj(Objects::toString)
                .map(s -> s.concat("imie"))
                .forEach(System.out::println); // double collon -> jeżeli Lambda przyjmuje jeden argument,
        // to "double collon" możemy wywołać dowolną metodę, która również przyjmuje dowolny argument i ma taki sam typ zwracany jak Lambda
        // Musi być tyle samo argumentów tego samego typu, co w metodzie, którą chcemy wywołać "double collonem" i musi być taki sam typ zwracany co w przypadku "double collona"
        // Czyli jeżeli metoda nic nie zwraca, to Lambda tez nie moze niz zwracać (sout() nic nie zwraca, tylko wypisuje, więc Labmda, a właściwie jej metoda, tez nic nie moze zwracać)
        // Jeżeli Lambda przyjumuje jeden argument typu String, to metoda też musi przyjmować jeden argument typu String
        // "double collon" jest nieparametrowalny
        // "double collon" jest niezależny od Klas (wszystkie go mają)
        // "Nie przyjmuje żadnego parametru"

        IntStream.range(0,100)
                .filter(s -> s % 2 == 0)
                //.mapToObj(s-> String.valueOf("Imie " + s))
                .mapToObj(String::valueOf) // valueOf -> ma taki sam typ zwracay jak potrzebuje "mapToObj" i dodatkowo Lambda (która mogłaby tu być) ma jeden argument, tak samo jak metoda "valueOf", któą uruchamiamy
                .forEach(System.out::println);
    }
}
