package com.company.JAVA10.Zadanie9_czy_jest_kwadratem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int b = scanner.nextInt();

        //System.out.println(isSquareOfIntegerNumber(b));

        if(isSquareOfIntegerNumber(b)) System.out.println("liczba jest kwadratem...");
        else System.out.println("liczba nie jest kwadratem...");
    }

    static boolean isSquareOfIntegerNumber(int number){
        double sqrtResult = Math.sqrt(number);
        System.out.println("Pierwiastek z " + number + " to " + sqrtResult);
        double result = number / sqrtResult;
        System.out.println ( number + " podzielić na " + sqrtResult + " to " + result);
        return number % sqrtResult == 0;
    }
}
