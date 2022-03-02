package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.TABLICE.Zad1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        int[] numbers2 = new int[5];
        int dl = numbers.length;

        int[] numbers3 = new int[dl];
        int[] numbers4 = new int[numbers3.length];

        numbers2 = numbers4;
        int[] tab = numbers2;

        System.out.println(numbers2 + " " + numbers4 + " " + tab);

        System.out.println(numbers4.length);

        numbers2[3] = 540;
        System.out.println(numbers2[3]);

        Main main = new Main();

        main.numbers(numbers);
        main.numbers(new int[] {1,2,3});
        System.out.println(main.numbers(new int[] {1,2,3}));
        System.out.println(main.numbers(new int[numbers.length]));



        //#############
        int[][] tabWielowymiarowa = new int[3][5];
        tabWielowymiarowa[0][2] = 35;
        int b = tabWielowymiarowa[0][2];

        System.out.println("wielowymiarowa " + b);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(Arrays.asList(numbers[i]));
        }


    }

    public int numbers(int[] tab){
        return tab.length;
    }
}
