package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.WATKI.Zad6;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        //
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        executorService.scheduleAtFixedRate(new Runnable() { //
            // new Runnable -> Klasa odpowiadająca za przekazanie zadania
            @Override
            public void run() {

                System.out.println("Hello");
            }
        },0,5, TimeUnit.SECONDS); // pierwsze opóźnienie, co ile ma się wykonywać ciało, w sekundach
        executorService.shutdown();
    }
}