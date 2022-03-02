package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.WATKI_LOKI.Zad1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    // Loki zakłądamy na Obiekcie. Warunkiem jest założenie blokady na metodzie, która jest synchronizowana
    public static void main(String[] args) {

        //
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Main main1 = new Main();

        // Wątek 1
        executorService.execute(new Runnable() { //
            // new Runnable -> Klasa odpowiadająca za przekazanie zadania
            @Override
            public void run() {

                while (true) {
                    main1.startSomething();
                }

            }
        });

        // Wątek 2
        executorService.execute(new Runnable() { //
            // new Runnable -> Klasa odpowiadająca za przekazanie zadania
            @Override
            public void run() {

                while (true) {
                    main1.startSomethingElse();
                    try {
                        Thread.sleep(1000); // usypia watek na 1 sekundę
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });

    }

    // musi byc synchronizacja zeby zarzucić blokadę wait()

    // Wątek 1
    public synchronized void startSomething() {
        System.out.println("Hey ale jakis dłuższy tekst");

        try {
            wait(); // metoda musi za każdym razem ściagnąć tę blokadę, dlatego będzie się wypisywać dużo mniej razy
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // wait(); // powoduje czekanie. Zatrzymujemy wątek, który operuje na jakimś Obiekcie i wprowadzamy go w stan oczekiwania, dopóki jakiś inny Obiekt go nie odblokuje
            // jeżeli robimy blokadę na Obiekcie, to ona tyczy się całego Obiektu, dlatego w drugiej metodzie, jakbyśmy też dodali "wait()". to dostaniemy IllegalStatementException

        }

        // Wątek 2
    public synchronized void startSomethingElse() {
        System.out.println("HEY 2");
        //notify(); //  ściąga blokadę "wait()" założonej na metodę startSomething()


    }
}