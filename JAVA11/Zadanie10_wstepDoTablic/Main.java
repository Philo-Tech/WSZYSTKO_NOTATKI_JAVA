package com.company.Zadanie10_wstepDoTablic;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[5]; // pusta tablica intów; domyślnie zera
        String[] names = new String[5];

        numbers[1] = 50;
        numbers[3] = 44;
        numbers[4] = 33;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int[] numbers2 = {1,1,2,3,5,4,3};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);

        }
    }
}
