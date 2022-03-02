package com.company.JAVA10.Zadanie6;

import java.util.Scanner;

public class przez3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe ");
        int a  = scanner.nextInt();
        if(a % 3 == 0) System.out.println("podzielna ");
        else System.out.println("niepodzielna ");
    }
}
