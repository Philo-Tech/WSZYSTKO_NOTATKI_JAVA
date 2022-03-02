package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.STRUMIENIE_LAMBDY.STRUMIENIE1.Zad2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StrumienieMetody {
    public static void main(String[] args) {

        // STRUMIEN OGÓLNY


        List<String> list = Arrays.asList("imie", "drugie", "Magda", "Tomek", "Romek", "Tadek");

        list.stream()
                .filter(s -> !s.endsWith("a"))  // .filter() -> metoda filtrująca, przyjmuje Predicate, który przyjmuje, jako argument, typ generyczny (typ strumienia) i zwraca boolean
                .forEach(s-> System.out.println(s)); // drukują wszystkie męskie imiona przefiltrowanej listy

        list.stream()
                .sorted() // sortowanie domyślne. Metoda bezargumentowa
                .forEach(s -> System.out.println(s));

        list.stream()
                .sorted() // może być też z argumentem (przeciążona). Wtedy można wskazać sposób sortowania. Jeżeli Klasa w strumieniu (generycznie na podstawie danych wejściowych) jest Comparable
                .distinct() // bedzie usuwac powtórzenia na podstawie metody equals()
                .limit(4)  // ogranicza strumień od końća (długość strumienia) do podanej liczby wystąpień
                .skip(2) // pomija n-poczatkowych elementów
              //.findAny() // operacja kończąca (w postaci Optional). Zwraca pierwszy napotkany element. Wynik można wtedy zapisać do "Optional<String> optional = list.stream()"  wypisanie-> optional.ifPresent((s-> sout(s)))
              //.anyMatch(s -> s.length() > 2);  // czy którykolwiek, z rekordów, który pozostał na Strumieniu wpasowywuje się w obowiązek który przekazaliśmy. Zwraca boolean
              //.allMatch(s -> s.length() > 2);  // wszystkie pasujące
                .forEach(s-> System.out.println(s));

        // MODYFIKACJA STRUMIENIA (pierwotna lista nie zostanie zmieniona)

        list.stream()
                .map(s -> s.length())  // modyfikujemt Strumień (teraz mamy Strumień ogólny, czyli obsługujący wszystkie Objecty) na Strumień Integerów
                .reduce((s, s1) -> s + s1 ) // reduce()  -> zamienia ileś elementów w jeden element (redukuje ilość elementów). Zwraca Optionala (redukuje do tego samego typu co jest Strumień, a my zamieniliśmy na Integer metodą map())
                .ifPresent(s -> System.out.println(s)); // bo reduce() zwrócił nam Optionala

        // ZAPISYWANIE WYNIKU W LISCIE

        List<Integer> integers = list.stream()  // Lista typu Integer, ponieważ map zmienia nam typ strumienia na Integer, więc już do końca Strumień będzie typu Integer
                .limit(3)
                .map(s-> s.length())
                .collect(Collectors.toList()); // przypisanie wyniku do Listy "integers"



        System.out.println("\n\n");
        // STRUMIEN WYSPECJALIZOWANY

        System.out.println(list.stream()
                .mapToInt(s -> s.length())// zamiana na Strumien wyspecjalizowany. Wtedy dostaniemy dostęp do metod "mapToInt", czyli np. max() | average() | sum()-> zsumuj długości |
                                        // mapToDouble()  |  mapToLong()
                .boxed() // wraca do sStrumienia ogólnego. Wtedy sum() nie zadziała, ponieważ jest metodą z "mapToInt()"
               // .sum()
                .noneMatch(s->s ==1)


        );

        // zamiast Strumienia, można utworzyć    parallelStream()

        list.parallelStream()  // parallelStream()  -> Strumień operujący na innym Wątku. Z automatu tworzy się osobny Wątek i wszystko jest wykonywane w nim
                .filter(s -> s.endsWith("a"))
                .forEach(System.out::println);



        // COLLECTORS (do budowania Stringa)

        System.out.println(list.stream()
                .sorted()
                .collect(Collectors.joining(" | ","Imiona ->  ", " | KONIEC ")));



        // InStream
        System.out.println(IntStream.range(0,200).average());
        System.out.println(IntStream.range(0,200).sum());
        IntStream.range(0,200).forEach(i-> System.out.println(i)); // obojętnie jka literka, może być "s"
        System.out.println(IntStream.of(1, 2, 3, 4, 5).average());
        System.out.println(IntStream.range(0,200).summaryStatistics().andThen((s)-> System.out.println(s))); // summaryStatistic() -> wszystkie statystyki  |  andThen() -> i co chcę z nimi zrobić




    }
}
