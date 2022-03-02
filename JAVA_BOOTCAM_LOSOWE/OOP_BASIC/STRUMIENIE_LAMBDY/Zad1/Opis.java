package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.STRUMIENIE_LAMBDY.Zad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Opis {
    // LAMBDA - weszły w Java 1.8 (JAVA 8). Programowanie funkcyjne
    //
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Oskar", "Damian", "Ada","Tomek","Magda"));

        names.sort((s,s1) -> s.compareTo(s1) * -1); // sortowanie listy // mamy do czynienia z wnioskowaniem typów (na podstawie Interfejsu, który siedzi pod tą metodą)
        // ==  (stary zapis, czyli Klasa anonimowa)
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2) * -1;
            }
        });

        names.forEach(System.out::println); // forEach zapisany jako Lambda i wypisanie. Wywołanie na lisćie "names"


        // Lambdy to funkcje anonimowe, czyli takie, które nie posiadają nazwy. Zamiast operować na stanach Obiektów, możemy bezpośrednio deklarować co chcemy zrobić
        // Lambdy to inny zapis na Klasy Anonimowe, czyli Klasy z jedną metodą anonimową
        // NIe deklarujemy metody !  Od razu wskazujemy co checmy zrobić a argumentami
        // Składnia: (type 1 arg1, type2 arg2...) -> (body)
        //      argumenty przekazywane do funkcji -> definicja funkcji
        //      podanie typów jest opcjonalne.

        // PRZYKLADY WYRAZEN LAMBDA
        /*  (int a, int b) -> {return a + b;} // pełny zapis
            () -> System.out.println("Hello world");  // bezargumentowa Lambda i wypisanie do konsoli. Zwraca void, bo nie ma return
            (String s) -> {System.out.println(s);}    // Lambda jednoargumentowa, nic nie zwraca. Nie ma return, pomimo, że są nawiasy klamrowe, ale metoda jest void
            () -> 42 // Labda bezargumentwa zwracająca liczbę 42. Jak nie ma nawiasów klamrowych, to nie trzeba podawać "return" jeżeli chcemy coś zwrócić z tej Lambdy. Bez nawiasów można tylk ozwrócić jedną zmienną
            () -> {return 3.1415}; // bezargumentowa zwracająca 3,1415 tylko w pełnym zapisie, ale on jest opcjonalny
            */



        // ZASADY TWORZENIA WYRAŻEN LAMBDA
        /*
        * - wyrazenie może miec zero, jeden lub więcej parametrów
        * - nie trzeba deklarować typó parametrów. Mamy do czynienia z wnioskowaniem typow
        * - Parametry w nawiasach rozdzielane sa przecinkami
        * - puste nawiasy wykorzystywane sa do reprezentowania pustych wywolan funkcji, np.: () -> 33
        * - Gdy mamy do czynienia z jednym parametrem i jego typ jest wnioskowany, nie musimy uzywac nawiasow klamrowych, np.: a -> return a*a (jak jest więcej argumentów, to też nie trzeba)
        * - ciało wyrazenia Lambda może zawierac zero lub wiecej wystapien. Można wykorzystywac tutaj nawiasy klamrowe do tworzenia blokow kodu
        * */
    }
}
