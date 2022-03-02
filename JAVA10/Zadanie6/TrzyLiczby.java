package com.company.JAVA10.Zadanie6;

import java.util.Scanner;

public class TrzyLiczby {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Podaj drugą: ");
        int secondName = scanner.nextInt();

        System.out.println("Podaj trzecią: ");
        int last = scanner.nextInt();

        if(firstNumber > secondName && firstNumber > last) System.out.println("Pierwsza jesta największa " + firstNumber);
        if(secondName > firstNumber && secondName > last) System.out.println("Druga jest największa " + secondName);
        if(last > firstNumber && last > secondName) System.out.println("Trzecia jest najwieksza: " + last);

        int[] liczby = {firstNumber, secondName, last};
        int max = 0 ;


        for (int i = 0; i < liczby.length; i++) {
            if (max < liczby[i]) max = liczby[i];
        }

        System.out.println("najwieksza to: " + max);

        int min = firstNumber < secondName ? firstNumber : secondName;
        min = min < last ? min : last;

        System.out.println("Minimum " + min);
    }

}
