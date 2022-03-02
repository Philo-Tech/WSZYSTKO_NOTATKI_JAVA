package com.company.Zadanie7_14;

public class Main {

    public static void main(String[] args) {

        int max = maxDividers(100,200);
        System.out.println(max);

    }

    private static int maxAmountDividers(int number){
        int count = 0;
        for (int i = 1; i < number; i++) {
            if(number % i == 0){
                count++;
            }
        }
        return count;
    }
    private static int maxDividers(int min, int max){
        int maxim = 0;
        for (int i = min; i <= max; i++) {
            int result = maxAmountDividers(i);
            if(maxim < result){
                maxim = result;
                System.out.println(i + "ma dzielników: " + maxim);
            }

        }
        return maxim;
    }
}
