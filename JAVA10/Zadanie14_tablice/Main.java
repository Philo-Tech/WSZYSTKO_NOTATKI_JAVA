package com.company.JAVA10.Zadanie14_tablice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj 1: ");
        int l1 = scanner.nextInt();
        System.out.println("podaj 2: ");
        int l2 = scanner.nextInt();

        int[] tab = {l1,l2};


        System.out.println("Suma elementów to: " + sumaElemTab(tab));
        System.out.println(middleElement(new int[]{1,2,3}));
        System.out.println(middleElement(new int[]{1,5,3,4}));

    }

    public static int middleElement(int[] arr){
        return arr[arr.length-1]/2;

    }

    public static int sumaElemTab(int[] tab){
        return tab[0] + tab[1];

    }
}
