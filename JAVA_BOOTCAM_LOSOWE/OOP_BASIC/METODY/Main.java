package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.METODY;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int c = (random.nextInt(100) + 1);
        System.out.println("wylosowana: " + c);

        int a = 4;
        int b = 2;
        int d = 5;

        showAverage(a,b,d);

        int[] tab = new int[2];
        tab[0] = a;
        tab[1] = b;


        Main main = new Main();
        main.showTab(reverseInt(tab));

        System.out.println(factorial(10));
        System.out.println(Math.sqrt(25));
        
    }
    public static int factorial(int n){
        int suma =1;
        for (int i = 1; i <=n ; i++) {
            suma*=i;
        }
        return suma;
    }

    public static int[] reverseInt(int[] tab){
        int[] tab1 = new int[2];
        tab1[0] = tab[1];
        tab1[1] = tab[0];

        return tab1;
    }
    public  void showTab(int[] tab){
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static void showAverage(int a, int b, int d){

        float average = (float) (a+b+d)/3;
        System.out.println(String.format("%.3f", average));
    }

}
