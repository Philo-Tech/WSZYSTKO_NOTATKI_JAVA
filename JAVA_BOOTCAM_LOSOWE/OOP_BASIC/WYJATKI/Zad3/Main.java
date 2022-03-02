package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.WYJATKI.Zad3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {

        // wyjątki typu "checked" czyli takie które trzeba przechwycić/ obsłużyć
        // wyjatki o któych Java wie już podczas kompilacji (o RuntimeException nic nie wie zanim program nie ruszy i coś się nie wydarzy)

        /*try {
            Files.write(new File("/test.txt").toPath(), "Test".getBytes(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        divide(2,0);
        play();
    }

    public static void play(){
        throw new IllegalArgumentException();
    }

    public static int divide(int a, int b){
        if (b==0){
            throw new ArithmeticException("Do not divide by 0"); // Java sama by go rzuciła. To tylko przykład
        }
        return a/b;
    }
}
