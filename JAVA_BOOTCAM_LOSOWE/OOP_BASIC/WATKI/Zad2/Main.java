package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.WATKI.Zad2;

public class Main {
    public static void main(String[] args) {
        // ThreadErrorSample
        // Tutaj wynika zawsze powinien być "0" a pojawiają się różne inne liczby
        // Wszystko zależy od procesora jak rozdysponuje czasem wątków
        // Wątki często muszą współdzielić jeden zasób

        Operation operation = new Operation();

        for (int i = 0; i < 1000; i++) {
            new Operation.Thread1(operation).start();
        }
    }

    private static class Operation {
        private int oskar = 0;

        public synchronized int operation() { // synchronized -> synchronizacja metody. Żaden inny wątek nie zostanie dopuszcony do  wykonania "operation()",
            // dopóki, któryś z nich nie zakończy na nich pracy. Czyli zadania się kolejkują. Czas wykonania takiej palikacji, będzie stosunkowo dłuższy
            // Silna synchronizacja, dlatego już nie będzie błedu (jeden wątek musi skończyć swoje działanie)
            // sa jeszcze inne metody synchronizacji: Semafory, Rygle, etc etc
            // Synchronizacja nie pozwala przerwać zadania przez inny wątek
            oskar++; // oskar = oskar + 1 //2
            oskar--; // oskar = oskar - 1
            return oskar;

        }

        private static class Thread1 extends Thread {
            Operation operation;

            public Thread1(Operation o) {
                operation = o;
            }

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    operation.operation();
                }
                System.out.println(operation.oskar);
            }

        }
    }
}


