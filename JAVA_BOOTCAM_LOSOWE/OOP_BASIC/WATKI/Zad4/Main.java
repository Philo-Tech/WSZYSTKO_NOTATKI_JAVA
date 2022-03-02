package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.WATKI.Zad4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    // Thread Executor -> wyzwalacze/ egzekutory wątków
    public static void main(String[] args) {


        ExecutorService executorService = Executors.newFixedThreadPool(3); // uruchamiamy 3 wątki

        executorService.execute(new Runnable() { // metoda execute() -> odpowiada za przekazanie zadania / za uruchomienie zadania w puli wątków /przekazujemy jakieś zadanie do puli wątków
            // new Runnable -> Klasa odpowiadająca za przekazanie zadania
            @Override
            public void run() {

                for (int i = 0; i < 10000; i++) {
                    System.out.println("Witaj");
                }
            }
        });

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("Witaj 2");
                }
            }
        });

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("Witaj 3");
                }
            }
        });

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("Witaj 4");
                }
            }
        });

    }
}