package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.PETLE.Zadanie11_KrolTablicy;

public class Main {
    public static void main(String[] args) {

        kingOfTheTable(new int[]{1, 1,1, 2, 2});

    }

    public static int kingOfTheTable(int[] tab) {

        int counter = 0;
        int number = 0;
        int result = 0;


        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (tab[i] == tab[j])
                    counter++;
                if (number < counter) {
                    number = counter;
                    result = tab[i];
                }
            }
            counter = 0;
        }
        if (number > (tab.length / 2)) {

            System.out.println("Liczba: " + result + " wystapien: " + number);
            return number;
        } else {
            System.out.println("nie ma krola");
            return -1;
        }
    }
}

