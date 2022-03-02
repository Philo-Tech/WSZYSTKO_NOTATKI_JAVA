package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.METODY3.Zad9;

public class Main {
    public static void main(String[] args) {

        mostDividers();

    }

    // NIE DZIAłA !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public static int mostDividers() {

        int number = 2;
        int temp = 0;
        int counter = 1;
        int biggest = 0;

        int[] tab = new int[9999];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = number++;
        }

        for (int i = 0; i < number - 1; i++) {
            temp = tab[i];

            for (int j = 1; j < number - 1; j++) {

                if (temp % tab[j] == 0) {
                    counter++;
                }
                if (biggest < counter)
                    biggest = counter;


            }
            counter = 0;

        }
        System.out.println(biggest);
        return biggest;
    }
}
