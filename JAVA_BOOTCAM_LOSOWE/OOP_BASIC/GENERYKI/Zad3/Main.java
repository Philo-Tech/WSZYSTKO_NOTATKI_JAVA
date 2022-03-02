package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.GENERYKI.Zad3;

public class Main {

    public static void main(String[] args) {

        System.out.println(hojo(5)); // można podstawić co się chce
        System.out.println(hojo("5")); //
    }

    public static <K> String hojo(K test){  // String to typ jaki zwraca metoda, a pod <K> możemy podstawić co chcemy jako argument przekazany do metody
        return "To wartość: " + test.toString();
    }

    // przyjmuje tablicę dowolnego typu, konwertuje ją na tablicę Stringów i zwraca tablicę Stringów
    public static <T> String[] convert(T[] arrayToConvert){
        String[] converted = new String[arrayToConvert.length];

        for (int i = 0; i < arrayToConvert.length; i++) {
            converted[i] = arrayToConvert[i].toString();
        }
        return converted;
    }


}
