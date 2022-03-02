package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.KOLEJKI.Zad1;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        // dziedziczy po intefjesie Collection więc metoda "add" musi się tam pojawić
        // "kolejka priorytetowa"- jedna z najczęscież używanych. Pozwala ustalać priorytet zadań-> każdy Objekt wbudowany w Java, posiada Interfejs porównywania
        // String ma wbudowane domyślne sortowanie alfabetyczne. Kolejka bierze to wbudowane sortowanie domyślne i układa zadanie w tej kolejce (w przypadku "int" i wszystkich typów Number byłoby to sortowanie rosnące)
        // mozną też manipulować hierachią ważności poprzez ustawienie priorytetów
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.add("aba");
        priorityQueue.add("aa");
        priorityQueue.add("a");
        priorityQueue.add("aca");

        for (String s : priorityQueue) {
            System.out.println(s);
        }

    }
}
