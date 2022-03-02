package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.WATKI.Zad1;

// najlepiej utuchamiać jak najmniej wątków i korzystać z tych, które już są zamiast uruchamiać nowe
// Jedynym sposobem, żeby wątek umarł jest zakończenie, przez niego, wykonywania zadania
// nie powinno być tak, że jedno zadanie to dwa wątki (wtedy powinny być blokady-> sleep())

public class Main {
    public static void main(String[] args) {

        Runnable task1 = new Runnable() { // Zadanie dla wątku. Bez dynamicznego przekazania.
            @Override
            public void run() {// ta metoda będzie odpalana, w momencie, gry wątek wystartuje (trzeba ją nadpisać jak tworzy się "new Runnable()")
                for (int i = 0; i < 10000; i++) {
                    System.out.println("Zadanie 1 " + i + " " + System.currentTimeMillis());
                    Thread.yield();// prośba do procesora o przerwanie wątku tym momencie
                }
            }
        };

        Runnable task2 = new Runnable() { // Zadanie dla wątku. Bez dynamicznego przekazania.
            @Override
            public void run() {// ta metoda będzie odpalana, w momencie, gry wątek wystartuje
                for (int i = 0; i < 10000; i++) {
                    System.out.println("Zadanie 2 " + i +" " + System.currentTimeMillis());
                    Thread.yield();
                }
            }
        };


        Thread thread2 = new Thread(task2);
        thread2.start();

    Thread thread = new Thread(task1); // utworzenie Obiektu opisującego wątek i przekazanie zadania, które opisane jest powyżej
        thread.start(); //uruchomienie wątku



        // to wykona się jako pierwsze, ponieważ wątki są ciężkie. Ten jest wątkiem głównym
        // tutaj wątek główny kończy swoje życie, ponieważ wykonał swoje zadanie
        System.out.println("Jestem bo oddycham");
    }
}
