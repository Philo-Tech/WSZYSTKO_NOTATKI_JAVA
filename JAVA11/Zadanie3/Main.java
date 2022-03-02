package com.company.Zadanie3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("pierwsza");
        int pierwsza = scanner.nextInt();
        System.out.println("druga");
        int druga = scanner.nextInt();
        System.out.println(multiply (pierwsza, druga));
        }



    public static int multiply (int a, int b){

        if((a < 100 || a > 300) || (b < 100 || a > 300 )){
            System.out.println ("liczba/yy spoza przedziału error! ");
            return -1;
        } return a * b;
    }
    }

