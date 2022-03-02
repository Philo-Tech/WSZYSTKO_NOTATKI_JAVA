package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.DATA_JAVA8.Zad1;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime bithday = LocalDateTime.of(1994,5,5,15,55);

        System.out.println(bithday.until(now, ChronoUnit.MINUTES));


    }
}
