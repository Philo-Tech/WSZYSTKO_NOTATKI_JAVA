package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.STRUMIENIE_LAMBDY.LAMBDA_TEST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaTest {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("oskar","tomek","magda","wojtek"));




        // compareTo ->  to interfejs funkcyjny wbudowany w Java, dlatego też możemy układać Lambdy (interfejs jest wbudowany w Java)
        names.sort((s,s1) -> s1.compareTo(s));  //names.sort(Comparator.reverseOrder()); -< to jest krószy zapis dlatego Lambda się wyszarzyła

        // Wbudowane interfejsy funkcyjne. Dzieki nim nie musimy tworzyć własnych. Pakiet "java.util.function;"
        // Są uniwersalne, ponieważ przyjmują typy generyczne jako argumenty
        // dzieki nim nie musimy pisać własnych Interfejsów pod Lambdy
        // jest ich około 30 -> pakiet "java.util.function" -> można zajrzeć do java.doc w wersji online
        /*
        * Predicate - jednoargumentowe funkcje o wartości logicznej
        *           boolean test(T t)
        * Function - przyjmują jeden argument i zwracają wynik
        *           R aplly(T t)
        * Supplier - zwracają wynik o określonym typie generycznym
        *           T get();
        * Consumer - reprezentują operacje, jakie mają zostać wykonane na pojedynczym argumencie wejściowym
        *           void accept(T t)
        * Comparator - porównują obiekty
        *           int compare(T o1, T o2)    \
        *
        * */


    }
}
