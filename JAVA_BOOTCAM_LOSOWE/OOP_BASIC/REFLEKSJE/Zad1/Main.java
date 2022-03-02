package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.REFLEKSJE.Zad1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    // Refleksje pozwalają dobrać się do bebechów Klasy (poszczególnych elementów Klas)
    // Pozwalją odczytać stan Klas, konstrukcje Klas,
    // metod, invokowanie, odczyt, zapis i wywoływanie

    // ZASTOSOWANIA - nieograniczone
    // do API,
    // np. gdy nie mamy dostępu do API/ Dokumentacji, a musimy pilnie uruchomość jakąś metodę, ale nie ma do niej dostępu
    // do sprawdzenia, czy jakieś pole/ argument jest wyrażone za pomocą adnotacji

    public static void main(String[] args) {

        Method[] methodsInMyClass = Person.class.getDeclaredMethods(); // metoda zwraca tablicę metod, po której możemy iterować pętlą forech
        try {
            Person person = Person.class.newInstance(); // nowa instancja Klasy w sposób refleksyjny

            for (Method inMyClass : methodsInMyClass) { // iterowanie po metodach
                if (inMyClass.getName().equals("shout")){ // zablokuje nas, ponieważ ta metoda jest Private
                    inMyClass.setAccessible(true); // zmieniamy dostęp do (prywatnej!) metody na "true"
                    inMyClass.invoke(person,null); // uruchamiamy za pomocą "invoke"
                }
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace(); // ta obsługuje "invoke"
        }


        // wypisujemy jakie metody mamy w nasej Klasie i jakie mamy do dyspozycji

        for (Method inMyClass : methodsInMyClass) {
            System.out.println(inMyClass.getName()); // wyświetli również metody prywatne. Refleksje omijają modyfikatory dostępu
            // można dobrać się do: -adnotacji(!!!) -parametrów - nazwy -defaultValue, którą zwraca ta metoda -exceptiony -typy generyczne -modyfikator dostępu (1- public; 2-private)
            // -ilośc argumentów -isAccesable (będą false, gdy nie mamy utworzonego Obiektu)
            // Za pomocą Refleksji nie można modyfikować napisanego kodu
        }
    }
}
